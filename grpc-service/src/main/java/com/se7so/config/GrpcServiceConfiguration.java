package com.se7so.config;

import com.se7so.dict.PasswordDictReader;
import com.se7so.grpc.GrpcServerInterceptor;
import com.se7so.grpc.HealthStatusService;
import com.se7so.grpc.PasswordsService;
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
    public PasswordsService passwordsService(GrpcServerInterceptor interceptor, PasswordDictReader reader) {
        return new PasswordsService(interceptor, reader);
    }

    @Bean
    public HealthStatusService healthStatusService(GrpcServerInterceptor interceptor, PasswordDictReader reader) {
        return new HealthStatusService(interceptor, reader);
    }
}
