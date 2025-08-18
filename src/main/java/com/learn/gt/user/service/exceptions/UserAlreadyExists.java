package com.learn.gt.user.service.exceptions;

public class UserAlreadyExists extends RuntimeException {
    public UserAlreadyExists(String message){
        super(message);
    }
}
