package com.se7so.config;

import com.se7so.client.GrpcClientInterceptor;
import com.se7so.client.UsersServiceClient;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class RestServiceConfiguration {

    @Value("${grpc.host}")
    private String grpcHost;
    @Value("${grpc.port}")
    private int grpcPort;

    @Bean
    public GrpcClientInterceptor grpcClientInterceptor() {
        return new GrpcClientInterceptor();
    }

    @Bean
    public UsersServiceClient usersServiceClient(GrpcClientInterceptor interceptor) {
        return new UsersServiceClient(this::managedUsersServiceChannel, interceptor);
    }

    public ManagedChannel managedUsersServiceChannel(){
        return ManagedChannelBuilder.forAddress(grpcHost, grpcPort)
                .usePlaintext(true)
                .build();
    }
}
