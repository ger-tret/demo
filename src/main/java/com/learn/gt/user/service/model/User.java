package com.learn.gt.user.service.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User  {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_seq")
    @SequenceGenerator(name = "id_seq", sequenceName = "id_seq", allocationSize = 1)
    private long userId;

    private String username;
    private String password;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    private String firstName;
    private String lastName;


    @Column(name = "role", nullable = false)
    @Enumerated(EnumType.STRING)
    private Role role;

    public enum Role{
        USER,
        ADMIN;
    }

    public User(long userId, String username, String password, String email, String firstName, String lastName) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = Role.USER;
    }
}
