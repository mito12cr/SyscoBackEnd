package com.SyscoProyect.SyscoBackEnd.Models;

import jdk.jfr.Timespan;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Order {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "CreatedAt", nullable = false)
    private Timespan CreatedAt;
    @Column(name = "User", nullable = false)
    private String User;
    @Column(name = "Id", nullable = false)
    private Integer Id;

    public Order() {
    }

    public Order(Timespan createdAt, String user, Integer id){
        this.CreatedAt = createdAt;
        this.User = user;
        this.Id = id;
    }

    public Timespan getCreatedAt() { return CreatedAt; }

    public void setCreatedAt(Timespan createdAt) { CreatedAt = createdAt; }

    public String getUser() { return User; }

    public void setUser(String user) { User = user; }

    public Integer getId() { return Id; }

    public void setId(Integer id) { Id = id; }
}
