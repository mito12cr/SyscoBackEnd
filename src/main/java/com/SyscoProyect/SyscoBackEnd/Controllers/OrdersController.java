package com.SyscoProyect.SyscoBackEnd.Controllers;

import com.SyscoProyect.SyscoBackEnd.Models.Orders;
import com.SyscoProyect.SyscoBackEnd.Models.Products;
import com.SyscoProyect.SyscoBackEnd.Services.OrdersService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class OrdersController {
    private final OrdersService ordersService;

    public OrdersController(OrdersService ordersService) {this.ordersService = ordersService;}

    @GetMapping("Orders")
    public ResponseEntity<List<Orders>> findAll() { return ResponseEntity.ok().body(ordersService.findAll());}

    @PostMapping("Orders")
    public ResponseEntity<Orders> save(Orders orders) { return ResponseEntity.ok().body(ordersService.save(orders));}

    @GetMapping("Orders/{Id}")
    public ResponseEntity<Orders> findById(@PathVariable long id) throws Exception {
        return ResponseEntity.ok().body(ordersService.findById(id)); }

    @PutMapping("Orders")
    public ResponseEntity<Orders> update(Orders orders) { return ResponseEntity.ok().body(ordersService.update(orders));}
}
