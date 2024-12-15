package com.mimaraslan.exception;

import lombok.Getter;

import java.util.Date;

@Getter
public class ErrorDetails {


    private Date timestamp;
    private String message;
    private String details;
    private int status;

    public ErrorDetails(Date timestamp, String message, String details, int status) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
        this.status = status;
    }
}