package com.testTask.service;


import com.testTask.model.entity.User;
import com.testTask.handlers.UserAlreadyExists;
import com.testTask.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    @Override
    public User registerUser(User user){
        if(userRepository.findById(user.getUserId()).isPresent()){
            throw new UserAlreadyExists("User for that ID=" + user.getUserId() + "already exists");
        }
        return userRepository.save(user);
    }


//    public User deleteUsers(String usersId){
//        return null;
//    }


    @Transactional
    @Override
    public User findUser(UUID id) {
       return userRepository.findById(id).orElse(null);
    }


}
