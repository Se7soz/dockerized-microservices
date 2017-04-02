package com.se7so.rest;

import com.se7so.client.UsersServiceClient;
import com.se7so.model.User;
import com.se7so.model.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/home")
public class SampleRest {

    @Autowired
    private UsersServiceClient usersServiceClient;

    @RequestMapping("/helloworld")
    public String showMessage() {
        return "Hello World";
    }

    @RequestMapping("/helloparam")
    public String showParamMessage(@RequestParam(value = "name", defaultValue = "World") String param) {
        return "Hello " + param;
    }

    @RequestMapping(value = "/remote-service", produces = "application/json")
    @ResponseBody
    public List<UserDto> getUsersFromRemoteService() {
        return usersServiceClient.getAllUsers();
    }
}
