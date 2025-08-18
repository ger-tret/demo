package com.learn.gt.user.service;


import com.learn.gt.user.service.dtos.UserDto;
import com.learn.gt.user.service.repository.UserRepository;
import com.learn.gt.user.service.service.mapper.UserMapper;
import com.learn.gt.user.service.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@MockitoBean(types = {UserDto.class, User.class, UserRepository.class})
public class UserRepositoryTests {

    private UserRepository userRepository;
    @Autowired
    void UserServiceTests(UserRepository userRepository){
        this.userRepository = userRepository;}

    private UserDto testUserDto;
    private User testUser;

    @BeforeEach
    public void setUp(){
        testUserDto = new UserDto(0, "Bob", "123", "Bob@gmail.com", "Bobby", "Kotik");
        testUser = new User(0, "Bob", "123", "Bob@gmail.com", "Bobby", "Kotik");
    }

    @Test
    void testFindingById() throws Exception{
        when(userRepository.findById(any())).thenReturn(Optional.ofNullable(testUser));
    }

    @Test
    void testSaving() throws Exception{
        when(userRepository.save(any())).thenReturn(testUser);
    }
}
