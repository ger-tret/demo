package com.learn.gt.user.service.dtos;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

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
