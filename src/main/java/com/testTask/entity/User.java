package com.testTask.entity;


import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name="Users")
public class User {
    @Id
    @Column(name = "userId", columnDefinition = "BINARY(16)")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID userId;

    private String username;
    private String password;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    private String firstName;
    private String lastName;

    @Enumerated(EnumType.STRING)
    private ROLE role;

    enum ROLE{
        USER,
        ADMIN
    }

    public User(UUID userId, String username, String password, String email, String firstName, String lastName, ROLE role) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    public UUID getUserId() {
        return userId;
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

    public ROLE getRole() {
        return role;
    }



}
