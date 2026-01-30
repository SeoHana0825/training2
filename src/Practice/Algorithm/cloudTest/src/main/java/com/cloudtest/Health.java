package com.cloudtest;

import lombok.Getter;

@Getter
public class Health {
    private final String status;
    private final String timestamp;

    public Health(String status, String timestamp) {
        this.status = status;
        this.timestamp = timestamp;
    }
}
