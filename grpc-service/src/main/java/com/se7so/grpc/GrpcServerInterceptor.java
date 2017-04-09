package com.se7so.grpc;

import com.codahale.metrics.Histogram;
import com.codahale.metrics.Meter;
import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.Timer;
import com.google.protobuf.MessageLite;
import io.grpc.ForwardingServerCall.SimpleForwardingServerCall;
import io.grpc.*;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@AllArgsConstructor
public class GrpcServerInterceptor implements ServerInterceptor {

    private static final String ERROR_METRIC = "server.error";
    private static final String M_REQ_TIME = "server.request.time";
    private static final String M_RESPONSE_SIZE = "server.response.size";

    private final MetricRegistry metricRegistry;

    /**
     * Intercept all GRPC calls
     * @param serverCall
     * @param metadata
     * @param serverCallHandler
     * @param <ReqT>
     * @param <RespT>
     * @return
     */
    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(final ServerCall<ReqT, RespT> serverCall, Metadata metadata, ServerCallHandler<ReqT, RespT> serverCallHandler) {

        Timer.Context timer = metricRegistry.timer(metricName(M_REQ_TIME, serverCall.getMethodDescriptor().getFullMethodName().replace("/", "."))).time();
        Histogram histogram = metricRegistry.histogram(metricName(M_RESPONSE_SIZE, serverCall.getMethodDescriptor().getFullMethodName().replace("/", ".")));

        SimpleForwardingServerCall<ReqT, RespT> nextCall = new SimpleForwardingServerCall<ReqT, RespT>(serverCall) {
            @Override
            public void close(Status status, Metadata trailers) {
                Meter errorMeter = metricRegistry.meter(metricName(ERROR_METRIC, getMethodDescriptor().getFullMethodName().replace("/", ".")));
                if (!status.isOk()) {
                    errorMeter.mark();
                    log.error("An error occured with {}", serverCall.getMethodDescriptor());
                }

                timer.stop();

                super.close(status, trailers);
            }

            @Override
            public void sendMessage(RespT message) {
                super.sendMessage(message);

                if (message instanceof MessageLite) {
                    histogram.update(((MessageLite) message).getSerializedSize());
                    log.info("Message sent size = {}", ((MessageLite) message).getSerializedSize());
                }
            }

        };
        return serverCallHandler.startCall(nextCall, metadata);
    }

    private String metricName(String metric, String method) {
        System.err.println(String.format("%s.%s", metric, method));

        return String.format("%s.%s", metric, method);
    }
}