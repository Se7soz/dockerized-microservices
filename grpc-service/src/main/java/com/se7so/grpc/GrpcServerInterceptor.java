package com.se7so.grpc;

import com.google.protobuf.MessageLite;
import io.grpc.ForwardingServerCall.SimpleForwardingServerCall;
import io.grpc.*;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class GrpcServerInterceptor implements ServerInterceptor {

    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(final ServerCall<ReqT, RespT> serverCall, Metadata metadata, ServerCallHandler<ReqT, RespT> serverCallHandler) {

        SimpleForwardingServerCall<ReqT, RespT> nextCall = new SimpleForwardingServerCall<ReqT, RespT>(serverCall) {
            @Override
            public void close(Status status, Metadata trailers) {
                if (!status.isOk()) {
                    log.error("An error occured with {}", serverCall.getMethodDescriptor());
                }
                super.close(status, trailers);
            }

            @Override
            public void sendMessage(RespT message) {
                super.sendMessage(message);

                if (message instanceof MessageLite) {
                    log.info("Message sent size = {}", ((MessageLite) message).getSerializedSize());
                }
            }

        };
        return serverCallHandler.startCall(nextCall, metadata);
    }
}