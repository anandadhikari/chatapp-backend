package com.hum.chatapp.exception;

import com.hum.chatapp.service.impl.SlackServiceImpl;

public class InternalServerErrorException extends RuntimeException {
    public InternalServerErrorException() {
        super();
    }

    public InternalServerErrorException(String message) {
        super(message);
        SlackServiceImpl.sendMessageToSlack(String.valueOf(message));
    }
}
