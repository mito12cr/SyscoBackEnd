package com.SyscoProyect.SyscoBackEnd.Services;

import com.SyscoProyect.SyscoBackEnd.Models.Order;

import java.util.List;

public interface OrdersService {
    Order save(Order order);
    List<Order> findAll();
    Order findById(long id) throws Exception;
    Order update(Order orders);
    void delete(long id) throws Exception;
}
