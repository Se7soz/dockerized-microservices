package com.se7so.grpc;

import io.grpc.Server;
import io.grpc.ServerInterceptors;
import io.grpc.ServerServiceDefinition;
import io.grpc.netty.NettyServerBuilder;

import java.io.IOException;

public interface GrpcService {

    int getPort();
    ServerServiceDefinition getServiceDefinition();
    Server getServer();
    void setServer(Server server);

    default void start() throws IOException {
        Server server = NettyServerBuilder
                .forPort(getPort())
                .addService(getServiceDefinition())
                .build()
                .start();

        setServer(server);
    }

    default void close() throws IOException {
        if(getServer() != null) {
            getServer().shutdown();
        }
    }
}
