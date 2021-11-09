package com.SyscoProyect.SyscoBackEnd.Services;

import com.SyscoProyect.SyscoBackEnd.Models.Orders;

import java.util.List;

public interface OrdersService {
    Orders save(Orders order);
    List<Orders> findAll();
    Orders findById(long id) throws Exception;
    Orders update(Orders orders);
    void delete(long id) throws Exception;
}
