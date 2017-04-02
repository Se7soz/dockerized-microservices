package com.se7so;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@EnableAsync
public class GrpcMicroService {

    public static void main(final String[] args) {
        System.setProperty("server.port", "8081");
        SpringApplication.run(GrpcMicroService.class, args);
    }
}
