package com.SyscoProyect.SyscoBackEnd.Services;

import com.SyscoProyect.SyscoBackEnd.Models.Orders;
import com.SyscoProyect.SyscoBackEnd.Models.Products;
import com.SyscoProyect.SyscoBackEnd.Repositories.OrdersRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrdersServiceImp implements OrdersService{
    private final OrdersRepository ordersRepository;

    public OrdersServiceImp(OrdersRepository ordersRepository) { this.ordersRepository = ordersRepository;}

    @Override
    public List<Orders> findAll() {
        return ordersRepository.findAll();
    }

    @Override
    public Orders save(Orders orders) {
        return ordersRepository.save(orders);
    }

    @Override
    public Orders findById(long id) throws Exception {
        return ordersRepository.findById(id).orElseThrow(Exception::new);
    }

    @Override
    public Orders update(Orders orders) {
        return ordersRepository.save(orders);
    }

    @Override
    public void delete(long id)throws Exception{
        ordersRepository.deleteById(id);
    }
}
