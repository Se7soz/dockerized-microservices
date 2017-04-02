package com.se7so.config;

import com.se7so.grpc.GrpcServerInterceptor;
import com.se7so.grpc.UsersGrpcService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:application.properties")
public class GrpcServiceConfiguration {

    @Bean
    public GrpcServerInterceptor grpcServerInterceptor() {
        return new GrpcServerInterceptor();
    }

    @Bean
    public UsersGrpcService usersGrpcService(GrpcServerInterceptor interceptor) {
        return new UsersGrpcService(interceptor);
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer
    propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
