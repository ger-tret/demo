package com.user_service.dtos;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class UserDto {

    @NotNull
    @Positive
    private int id;

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

    public UserDto(Integer id, String username, String password, String email, String firstName, String lastName) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public UserDto(int id,String username, String password, String email, String firstName, String lastName) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public UserDto(){}

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
