package com.se7so.model;

import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;
import java.util.List;

@Builder
@Getter
public class PasswordsResponseDto implements Serializable {
    private int totalMatches;
    private List<String> matches;
}
