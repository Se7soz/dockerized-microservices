package com.se7so.config;

import com.se7so.grpc.HealthStatusService;
import com.se7so.grpc.PasswordsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.Closeable;
import java.io.IOException;

@Service
@RequiredArgsConstructor(onConstructor =  @__(@Autowired))
@Log4j2
public class ServerEngine implements Closeable {

    private final PasswordsService passwordsService;
    private final HealthStatusService healthStatusService;

    @PostConstruct
    public void start() {
        try {
            passwordsService.start();
            healthStatusService.start();

            Runtime.getRuntime().addShutdownHook(new Thread() {
                @Override
                public void run() {
                    close();
                }
            });
        }
        catch (Exception ex) {
            log.error("An error occured while starting server",  ex);
        }
    }

    @Override
    public void close() {
        try {
            passwordsService.close();
            healthStatusService.close();
        }
        catch (Exception ex) {
            log.error("Can't close users service", ex);
        }
    }
}
