package com.hum.chatapp.exception;

import com.hum.chatapp.service.impl.SlackServiceImpl;
import com.hum.chatapp.service.impl.SlackServiceImpl;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException() {
        super();
    }

    public UserNotFoundException(String message) {
        super(message);
        SlackServiceImpl.sendMessageToSlack(message);
    }
}
