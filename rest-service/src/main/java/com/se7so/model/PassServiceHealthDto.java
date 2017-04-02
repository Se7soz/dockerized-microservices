package com.se7so.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class PassServiceHealthDto {
    private String status;
    private long dictSize;
}
