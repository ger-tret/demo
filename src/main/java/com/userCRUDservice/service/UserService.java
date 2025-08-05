package com.userCRUDservice.service;

import com.userCRUDservice.dtos.UserDto;
import com.userCRUDservice.model.User;

import java.util.UUID;

public interface UserService {
    Integer registerUser(UserDto userDto);
    User findUser(Integer id);
}
