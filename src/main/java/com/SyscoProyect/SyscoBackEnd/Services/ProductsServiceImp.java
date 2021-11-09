package com.SyscoProyect.SyscoBackEnd.Services;

import com.SyscoProyect.SyscoBackEnd.Models.Products;
import com.SyscoProyect.SyscoBackEnd.Repositories.ProductsRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductsServiceImp implements ProductsService{
    private  final ProductsRepository productsRepository;

    public ProductsServiceImp(ProductsRepository productsRepository){
        this.productsRepository = productsRepository;
    }

    @Override
    public List<Products> findAll() {
        return productsRepository.findAll();
    }

    @Override
    public Products save(Products products) {
        return productsRepository.save(products);
    }

    @Override
    public Products findById(long id) throws Exception {
        return productsRepository.findById(id).orElseThrow(Exception::new);
    }

    @Override
    public Products update(Products products) {
        return productsRepository.save(products);
    }

    @Override
    public void delete(long id)throws Exception{
        productsRepository.deleteById(id);
    }
}
