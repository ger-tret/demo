package com.testTask.model;


import com.testTask.model.entity.User;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users = new HashSet<>();


    public Role(Long id, String username, Set<User> users) {
        this.id = id;
        this.username = username;
        this.users = users;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public Set<User> getUsers() {
        return users;
    }

}
