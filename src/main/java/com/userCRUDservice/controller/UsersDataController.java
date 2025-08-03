package com.userCRUDservice.controller;


import com.userCRUDservice.model.entity.User;
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

    @PostMapping
    public ResponseEntity<User> createUserEntry(@RequestBody User user, UUID adminId) {
       return ResponseEntity.ok(userServiceImpl.registerUser(user));
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findUserEntry(@PathVariable("id") UUID id) {
        return ResponseEntity.ok(userServiceImpl.findUser(id));
    }

    @DeleteMapping
    public void deleteUserEntry(){

    }

}
