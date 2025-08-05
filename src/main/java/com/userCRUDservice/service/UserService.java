package com.userCRUDservice.service;

import com.userCRUDservice.dtos.UserDto;
import com.userCRUDservice.model.User;

import java.util.UUID;

public interface UserService {
    User registerUser(UserDto userDto);
    User findUser(UUID id);
}
