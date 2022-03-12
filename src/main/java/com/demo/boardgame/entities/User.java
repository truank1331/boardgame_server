package com.demo.boardgame.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="boardgame")
public class User {
    @Id
    @Column(name="username")
    private String username;

    @Column(name="role")
    private String role;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;
}
