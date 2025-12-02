package com.educandoweb.couse.services;

import com.educandoweb.couse.entities.Order;
import com.educandoweb.couse.entities.User;
import com.educandoweb.couse.repositories.OrderRepository;
import com.educandoweb.couse.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj =  repository.findById(id);
        return obj.get();
    }
}
