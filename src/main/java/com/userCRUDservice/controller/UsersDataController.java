package com.userCRUDservice.controller;


import com.userCRUDservice.dtos.UserDto;
import com.userCRUDservice.model.User;
import com.userCRUDservice.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UsersDataController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @PostMapping()
    public ResponseEntity<User> createUserEntry(@RequestBody UserDto userDto) {
       return ResponseEntity.ok(userServiceImpl.registerUser(userDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findUserEntry(@PathVariable("id") UUID id) {
        return ResponseEntity.ok(userServiceImpl.findUser(id));
    }


}
