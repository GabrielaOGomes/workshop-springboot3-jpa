package com.educandoweb.couse.resources;

import com.educandoweb.couse.entities.Product;
import com.educandoweb.couse.entities.User;
import com.educandoweb.couse.services.ProductService;
import com.educandoweb.couse.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    //ijeção de depedencia para o service
    @Autowired
    private ProductService service;

    //endpoint para acessar usuários
    //controlador rest que responde no caminho Users
    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> list = service.findAll();

        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        Product obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
