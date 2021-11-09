package com.SyscoProyect.SyscoBackEnd.Controllers;

import com.SyscoProyect.SyscoBackEnd.Models.Order;
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
    public ResponseEntity<List<Order>> findAll() { return ResponseEntity.ok().body(ordersService.findAll());}

    @PostMapping("Orders")
    public ResponseEntity<Order> save(Order orders) { return ResponseEntity.ok().body(ordersService.save(orders));}

    @GetMapping("Orders/{Id}")
    public ResponseEntity<Order> findById(@PathVariable long id) throws Exception {
        return ResponseEntity.ok().body(ordersService.findById(id)); }

    @PutMapping("Orders")
    public ResponseEntity<Order> update(Order orders) { return ResponseEntity.ok().body(ordersService.update(orders));}
}
