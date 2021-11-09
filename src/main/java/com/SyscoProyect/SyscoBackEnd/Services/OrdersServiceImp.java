package com.SyscoProyect.SyscoBackEnd.Services;

import com.SyscoProyect.SyscoBackEnd.Models.Order;
import com.SyscoProyect.SyscoBackEnd.Repositories.OrdersRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrdersServiceImp implements OrdersService{
    private final OrdersRepository ordersRepository;

    public OrdersServiceImp(OrdersRepository ordersRepository) { this.ordersRepository = ordersRepository;}

    @Override
    public List<Order> findAll() {
        return ordersRepository.findAll();
    }

    @Override
    public Order save(Order orders) {
        return ordersRepository.save(orders);
    }

    @Override
    public Order findById(long id) throws Exception {
        return ordersRepository.findById(id).orElseThrow(Exception::new);
    }

    @Override
    public Order update(Order orders) {
        return ordersRepository.save(orders);
    }

    @Override
    public void delete(long id)throws Exception{
        ordersRepository.deleteById(id);
    }
}
