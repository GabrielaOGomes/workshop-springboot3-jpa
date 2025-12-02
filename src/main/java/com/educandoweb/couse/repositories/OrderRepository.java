package com.educandoweb.couse.repositories;

import com.educandoweb.couse.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

//instância obj repository

public interface OrderRepository extends JpaRepository<Order,Long> {
}
