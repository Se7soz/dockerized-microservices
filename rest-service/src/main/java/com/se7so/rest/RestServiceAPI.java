package com.se7so.rest;

import com.se7so.client.PasswordsServiceClient;
import com.se7so.model.PassServiceHealthDto;
import com.se7so.model.PasswordsResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RestServiceAPI {

    @Autowired
    private PasswordsServiceClient passwordsServiceClient;

    @RequestMapping(value = "/health", produces = "application/json")
    public PassServiceHealthDto getPasswordServiceHealthDto() {
        return passwordsServiceClient.getHealthStatus();
    }

    @RequestMapping(value = "/passwords", produces = "application/json")
    @ResponseBody
    public PasswordsResponseDto getPasswordsService(@RequestParam(value = "q") String query) {
        return passwordsServiceClient.findPasswordMatches(query);
    }
}
