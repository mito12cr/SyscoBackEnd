package com.SyscoProyect.SyscoBackEnd.Repositories;

import com.SyscoProyect.SyscoBackEnd.Models.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Long> {
}
