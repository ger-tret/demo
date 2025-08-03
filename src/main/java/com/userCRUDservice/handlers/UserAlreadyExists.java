package com.userCRUDservice.handlers;

public class UserAlreadyExists extends RuntimeException {
    public UserAlreadyExists(String message){
        super(message);
    }
}
