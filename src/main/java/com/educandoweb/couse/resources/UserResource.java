package com.educandoweb.couse.resources;

import com.educandoweb.couse.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    //endpint para acessar usuários
    //controlador rest que responde no caminho Users
    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Maria", "maria@gmail.com","95658475", "12345");
        return ResponseEntity.ok(u);
    }
}
