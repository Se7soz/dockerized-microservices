package com.se7so.grpc;

import com.se7so.model.User;
import com.se7so.model.UsersQuery;
import com.se7so.model.UsersResponse;
import com.se7so.client.UsersServiceGrpc;
import io.grpc.Server;
import io.grpc.ServerInterceptors;
import io.grpc.netty.NettyServerBuilder;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.io.IOException;

@RequiredArgsConstructor(onConstructor =  @__(@Autowired))
@Log4j2
public class UsersGrpcService extends UsersServiceGrpc.UsersServiceImplBase {

    @Value("${grpc.port}")
    private int grpcPort;

    private Server server;
    private final GrpcServerInterceptor interceptor;

    @Override
    public void getUsers(UsersQuery request, StreamObserver<UsersResponse> responseObserver) {
        responseObserver.onNext(UsersResponse.newBuilder()
                .addUsers(
                        User.newBuilder()
                        .setUsername("se7so")
                        .setPassword("gamed"))
                .addUsers(
                        User.newBuilder()
                        .setUsername("Hello")
                        .setPassword("World"))
                .build());

        responseObserver.onCompleted();
    }

    public void start() throws IOException {
        log.info("Starting UsersService endpoint");
        server = NettyServerBuilder
                .forPort(grpcPort)
                .addService(ServerInterceptors.intercept(bindService(), interceptor))
                .build()
                .start();

        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                log.info("*** shutting down gRPC server since JVM is shutting down");
                try {
                    close();
                } catch (IOException ex) {
                    log.error("An error occured while shutting down server", ex);
                }
                log.info("*** server shut down");
            }
        });
    }

    public void close() throws IOException {
        if (server != null){
            server.shutdown();
        }
    }
}
