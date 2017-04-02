package com.se7so.grpc;

import com.google.protobuf.Empty;
import com.se7so.dict.PasswordDictReader;
import com.se7so.dict.PasswordTrie;
import com.se7so.model.FindPasswordsQuery;
import com.se7so.model.FindPasswordsResponse;
import com.se7so.model.PasswordsServiceHealthStatus;
import com.se7so.service.PasswordsServiceGrpc;
import com.se7so.service.PasswordsServiceHealthServiceGrpc;
import io.grpc.Server;
import io.grpc.ServerInterceptors;
import io.grpc.ServerServiceDefinition;
import io.grpc.netty.NettyServerBuilder;
import io.grpc.stub.StreamObserver;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.io.IOException;

@RequiredArgsConstructor(onConstructor =  @__(@Autowired))
@Log4j2
public class HealthStatusService extends PasswordsServiceHealthServiceGrpc.PasswordsServiceHealthServiceImplBase implements GrpcService {

    @Getter
    @Value("${health.status.grpc.port}")
    private int port;
    @Getter
    @Setter
    private Server server;
    private final GrpcServerInterceptor interceptor;
    private final PasswordDictReader passwordReader;

    @Override
    public void getPasswordsServiceHealthStatus(Empty request, StreamObserver<PasswordsServiceHealthStatus> responseObserver) {
        responseObserver.onNext(PasswordsServiceHealthStatus.newBuilder()
                .setStatus(passwordReader.getDict().size() == 0 ? "Error" : "Running")
                .setTotalPasswordsLoaded(passwordReader.getDict().size())
                .build());

        responseObserver.onCompleted();
    }

    @Override
    public ServerServiceDefinition getServiceDefinition() {
        return ServerInterceptors.intercept(bindService(), interceptor);
    }
}
