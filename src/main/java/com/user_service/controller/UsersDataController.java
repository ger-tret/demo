package com.user_service.controller;


import com.user_service.dtos.IdDto;
import com.user_service.dtos.UserDto;
import com.user_service.model.User;
import com.user_service.service.UserServiceImpl;
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

    @PostMapping()
    public ResponseEntity<IdDto> createUserEntry(@RequestBody @Valid UserDto userDto) {
       return ResponseEntity.ok(new IdDto(userServiceImpl.registerUser(userDto)));
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findUserEntry(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(userServiceImpl.findUser(id));
    }


}
