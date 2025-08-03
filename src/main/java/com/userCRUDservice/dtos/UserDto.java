package com.userCRUDservice.dtos;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.UUID;

public class UserDto {

    @NotNull
    private UUID id;

    @NotNull(message = "username is required")
    @Size(min = 1, max = 100)
    private String username;

    @NotNull(message = "password is required")
    @Size(min = 1, max = 100)
    private String password;

    @NotNull(message = "email is required")
    private String email;

    @NotNull(message = "first name is required")
    @Size(min = 1, max = 100)
    private String firstName;

    @NotNull(message = "last name is required")
    @Size(min = 1, max = 100)
    private String lastName;


}
