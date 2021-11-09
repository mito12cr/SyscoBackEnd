package com.SyscoProyect.SyscoBackEnd.Repositories;

import com.SyscoProyect.SyscoBackEnd.Models.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends JpaRepository<Products , Long> {
}
