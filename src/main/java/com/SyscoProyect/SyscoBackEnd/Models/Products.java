package com.SyscoProyect.SyscoBackEnd.Models;

import javax.persistence.*;
import java.awt.*;

@Entity
@Table
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "price",nullable = false)
    private Integer price;
    @Column(name = "name",nullable = false)
    private String name;
    @Column(name = "image",nullable = false)
    private Image image;
    @Column(name = "Created",nullable = false)
    private Integer Created;

    public Products(){ }

    public Products(Integer price,String name,Image image,Integer created)
    {
        this.price = price;
        this.name = name;
        this.image = image;
        this.Created = created;

    }

    public long getId(){ return id; }

    public void setId(long id) { this.id = id; }

    public Integer getPrice() { return price; }

    public void setPrice(Integer price) { this.price = price; }

    public String getName() { return name; }

    public void  setName(String name) {this.name = name;}

    public Image getImage() { return image; }

    public void setImage(Image image) { this.image = image; }

    public Integer getCreated() { return Created; }

    public void setCreated(Integer created) { this.Created = created; }

}
