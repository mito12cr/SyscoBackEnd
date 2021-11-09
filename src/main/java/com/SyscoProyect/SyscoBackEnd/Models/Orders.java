package com.SyscoProyect.SyscoBackEnd.Models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Orders{
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "CreatedAt", nullable = false)
    private Integer CreatedAt;
    @Column(name = "User", nullable = false)
    private String User;
    @Column(name = "Id", nullable = false)
    private Integer Id;

    public Orders() {
    }

    public Orders(Integer createdAt, String user, Integer id){
        this.CreatedAt = createdAt;
        this.User = user;
        this.Id = id;
    }

    public Integer getCreatedAt() { return CreatedAt; }

    public void setCreatedAt(Integer createdAt) { CreatedAt = createdAt; }

    public String getUser() { return User; }

    public void setUser(String user) { User = user; }

    public Integer getId() { return Id; }

    public void setId(Integer id) { Id = id; }
}
