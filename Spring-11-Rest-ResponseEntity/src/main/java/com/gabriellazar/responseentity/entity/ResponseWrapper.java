package com.gabriellazar.responseentity.entity;

import org.springframework.http.HttpStatus;

public class ResponseWrapper {
    private boolean success;
    private String message;
    private Integer statusCode;
    private Object data;

    public ResponseWrapper(String message, Object data,HttpStatus httpStatus) {
        this.message = message;
        this.data = data;
        this.success = true;
        this.statusCode = httpStatus.value();
    }
}
