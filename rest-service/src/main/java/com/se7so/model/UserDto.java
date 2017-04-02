package com.se7so.model;

import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;

@Builder
@Getter
public class UserDto implements Serializable {
    private String username;
    private String password;
}
