package com.learn.gt.user.service.service;

import com.learn.gt.user.service.dtos.UserDto;
import com.learn.gt.user.service.model.User;

public interface UserService {
    Long registerUser(UserDto userDto);
    User findUser(Long id);
}
