package com.pasindu.spring.springexceptionhandling.exception;

import java.util.Date;

public class ErrorResponse {
    Date timestamp;
    String message;
    String detail;


    public ErrorResponse(Date timestamp,String message, String detail ) {
        this.message = message;
        this.detail = detail;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
