package com.se7so.metrics;

import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.graphite.Graphite;
import com.codahale.metrics.graphite.GraphiteReporter;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.InetSocketAddress;
import java.util.concurrent.TimeUnit;

@Configuration
@Log4j2
public class GrpcServicesMetrics {

    @Value("${graphite.host}")
    private String graphiteHost;
    @Value("${graphite.port}")
    private int graphitePort;

    @Bean
    public MetricRegistry metricRegistry() {
        MetricRegistry metricRegistry = new MetricRegistry();

        startReporter(metricRegistry);
        return metricRegistry;
    }

    private void startReporter(MetricRegistry registry) {

        try {
            Graphite graphite = new Graphite(new InetSocketAddress(graphiteHost, graphitePort));

            GraphiteReporter.forRegistry(registry)
                    .prefixedWith("metrics")
                    .build(graphite)
                    .start(30, TimeUnit.SECONDS);
        }
        catch (Exception ex) {
            log.error("An error occurred while connecting to graphite host = {}, port = {}", graphiteHost, graphitePort, ex);
        }
    }
}
