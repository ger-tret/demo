package com.userCRUDservice.service;

import com.userCRUDservice.model.entity.User;

import java.util.UUID;

public interface UserService {
    User registerUser(User user);
    User findUser(UUID id);
}
