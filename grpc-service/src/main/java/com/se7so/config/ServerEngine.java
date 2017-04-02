package com.se7so.config;

import com.se7so.grpc.UsersGrpcService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.Closeable;

@Service
@RequiredArgsConstructor(onConstructor =  @__(@Autowired))
@Log4j2
public class ServerEngine implements Closeable {

    private final UsersGrpcService usersService;

    @PostConstruct
    public void start() {
        try {
            usersService.start();
        }
        catch (Exception ex) {
            log.error("An error occured while starting server",  ex);
        }
    }

    @Override
    public void close() {
        try {
            usersService.close();
        }
        catch (Exception ex) {
            log.error("Can't close users service", ex);
        }
    }
}
