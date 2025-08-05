package com.userCRUDservice.service;


import com.userCRUDservice.dtos.UserDto;
import com.userCRUDservice.model.User;
import com.userCRUDservice.handlers.UserAlreadyExists;
import com.userCRUDservice.repository.UserRepository;
import com.userCRUDservice.service.mapper.UserMapper;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    @Transactional
    @Override
    public Integer registerUser(UserDto userDto){
//        if(userRepository.findById(userDto.getId()).isPresent()){
//            throw new UserAlreadyExists("User for that ID=" + userDto.getId() + "already exists");
//        }
        return userRepository.save(userMapper.mapperDtoToEntity().map(userDto)).getUserId();
    }


//    public User deleteUsers(String usersId){
//        return null;
//    }


    @Transactional
    @Override
    public User findUser(Integer id) {
       return userRepository.findById(id).orElse(null);
    }


}
