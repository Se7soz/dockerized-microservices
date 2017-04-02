package com.se7so.config;

import com.se7so.client.GrpcClientInterceptor;
import com.se7so.client.PasswordsServiceClient;
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
    @Value("${password.service.grpc.port}")
    private int passwordsServicePort;
    @Value("${health.status.grpc.port}")
    private int healthServicePort;

    @Bean
    public GrpcClientInterceptor grpcClientInterceptor() {
        return new GrpcClientInterceptor();
    }

    @Bean
    public PasswordsServiceClient passwordsServiceClient(GrpcClientInterceptor interceptor) {
        return new PasswordsServiceClient(this::managedPasswordsServiceChannel, this::managedHealthServiceChannel, interceptor);
    }

    public ManagedChannel managedPasswordsServiceChannel(){
        return ManagedChannelBuilder.forAddress(grpcHost, passwordsServicePort)
                .usePlaintext(true)
                .build();
    }

    public ManagedChannel managedHealthServiceChannel(){
        return ManagedChannelBuilder.forAddress(grpcHost, healthServicePort)
                .usePlaintext(true)
                .build();
    }
}
