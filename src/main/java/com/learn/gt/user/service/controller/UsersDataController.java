package com.learn.gt.user.service.controller;


import com.learn.gt.user.service.dtos.IdDto;
import com.learn.gt.user.service.dtos.UserDto;
import com.learn.gt.user.service.model.User;
import com.learn.gt.user.service.service.UserServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsersDataController {

    private UserServiceImpl userServiceImpl;

    @Autowired
    public UsersDataController(UserServiceImpl userServiceImpl){
        this.userServiceImpl = userServiceImpl;
    }

    @PostMapping
    public ResponseEntity<IdDto> createUserEntry(@RequestBody @Valid UserDto userDto) {
       return ResponseEntity.ok(new IdDto(userServiceImpl.registerUser(userDto)));
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findUserEntry(@PathVariable("id") Long id) {
        return ResponseEntity.ok(userServiceImpl.findUser(id));
    }


}
