package com.testTask.service;

import com.testTask.model.entity.User;

import java.util.UUID;

public interface UserService {
    User registerUser(User user);
    User findUser(UUID id);
}
