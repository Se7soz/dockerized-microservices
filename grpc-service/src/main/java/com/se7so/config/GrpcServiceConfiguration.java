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

    /**
     * GRPC server interceptor
     * @return An interceptor instance for grpc services
     */
    @Bean
    public GrpcServerInterceptor grpcServerInterceptor() {
        return new GrpcServerInterceptor();
    }

    /**
     * GRPC password service
     * @param interceptor GRPC services interceptor
     * @param reader Password store reader
     * @return Password service instance
     */
    @Bean
    public PasswordsService passwordsService(GrpcServerInterceptor interceptor, PasswordDictReader reader) {
        return new PasswordsService(interceptor, reader);
    }

    /**
     * GRPC services health status service
     * @param interceptor GRPC services interceptor
     * @param reader Password store reader
     * @return Health status service instance
     */
    @Bean
    public HealthStatusService healthStatusService(GrpcServerInterceptor interceptor, PasswordDictReader reader) {
        return new HealthStatusService(interceptor, reader);
    }
}
