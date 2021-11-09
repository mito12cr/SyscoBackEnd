package com.SyscoProyect.SyscoBackEnd.Services;

import com.SyscoProyect.SyscoBackEnd.Models.Products;

import java.util.List;

public interface ProductsService {
    Products save(Products products);
    List<Products> findAll();
    Products findById(long id) throws Exception;
    Products update(Products products);
    void delete(long id) throws Exception;
}
