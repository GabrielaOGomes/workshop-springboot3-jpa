package com.educandoweb.couse.repositories;

import com.educandoweb.couse.entities.Category;
import com.educandoweb.couse.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

//instância obj repository

public interface ProductRepository extends JpaRepository<Product,Long> {
}
