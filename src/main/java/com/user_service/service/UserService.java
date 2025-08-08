package com.user_service.service;

import com.user_service.dtos.UserDto;
import com.user_service.model.User;

public interface UserService {
    Integer registerUser(UserDto userDto);
    User findUser(Integer id);
}
