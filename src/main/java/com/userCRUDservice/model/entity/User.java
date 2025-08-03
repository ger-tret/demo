package com.userCRUDservice.model.entity;


import com.userCRUDservice.model.Role;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;
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

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "roles",
            joinColumns = @JoinColumn(name = "userId"),
            inverseJoinColumns = @JoinColumn(name = "roleId")
            )
    private Set<Role> roles = new HashSet<>();

    public User(UUID userId, String username, String password, String email, String firstName, String lastName, Set<Role> roles) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.roles = roles;
    }

    public User() {
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

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
