package com.educandoweb.couse.services;

import com.educandoweb.couse.entities.Product;
import com.educandoweb.couse.entities.User;
import com.educandoweb.couse.repositories.ProductRepository;
import com.educandoweb.couse.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    //injeção de dependencia para ProductRepository
    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj =  repository.findById(id);
        return obj.get();
    }
}
