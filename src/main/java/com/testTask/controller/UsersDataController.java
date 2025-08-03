package com.testTask.controller;


import com.testTask.model.entity.User;
import com.testTask.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UsersDataController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    private MailSender mailSender;
    private SimpleMailMessage templateMessage;

    public void setMailSender(MailSender mailSender){
        this.mailSender = mailSender;
    }

    public void setTemplateMessage(SimpleMailMessage templateMessage){
        this.templateMessage = templateMessage;
    }


    @PostMapping
    public void createUserEntry(@RequestBody User user, UUID adminId) {
        userServiceImpl.registerUser(user);

//        if (user.getRole()) {
//            SimpleMailMessage msg = new SimpleMailMessage(this.templateMessage);
//            msg.setTo(userService.findUser(adminId).getEmail());
//            msg.setText("");
//        }
    }

    @GetMapping("/{id}")
    public void findUserEntry(@PathVariable("id") UUID id) {
        userServiceImpl.findUser(id);
    }

    @DeleteMapping
    public void deleteUserEntry(){

    }

}
