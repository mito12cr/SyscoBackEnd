package com.SyscoProyect.SyscoBackEnd.Models;

import org.hibernate.id.GUIDGenerator;

import javax.persistence.*;

@Entity
@Table
public class Items {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private GUIDGenerator id;
    @Column(name = "qty", nullable = false)
    private Integer qty;

    public Items() {
    }

    public Items(GUIDGenerator id, Integer qty) {
        this.id = id;
        this.qty = qty;
    }

    public GUIDGenerator getId() { return id; }

    public void setId(GUIDGenerator id) { this.id = id; }

    public Integer getQty() { return  qty; }

    public void setQty(Integer qty) { this.qty = qty; }
}
