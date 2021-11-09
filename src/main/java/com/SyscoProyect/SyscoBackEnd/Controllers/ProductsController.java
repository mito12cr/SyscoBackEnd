package com.SyscoProyect.SyscoBackEnd.Controllers;

import com.SyscoProyect.SyscoBackEnd.Models.Products;
import com.SyscoProyect.SyscoBackEnd.Services.ProductsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ProductsController {
    private final ProductsService productsService;

    public ProductsController(ProductsService productsService) { this.productsService = productsService;}

    @GetMapping("products")
    public ResponseEntity<List<Products>> findAll() { return  ResponseEntity.ok().body(productsService.findAll());}

    @PostMapping("products")
    public ResponseEntity<Products> save(Products products) { return ResponseEntity.ok().body(productsService.save(products));}

    @GetMapping("products/{id}")
    public ResponseEntity<Products> findById(@PathVariable long id) throws Exception {
        return ResponseEntity.ok().body(productsService.findById(id)); }

    @PutMapping("products")
    public ResponseEntity<Products> update(Products products) { return ResponseEntity.ok().body(productsService.update(products));}
}
