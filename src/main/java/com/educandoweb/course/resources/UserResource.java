package com.educandoweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.services.UserService;

/*@RestController:
Esta anotação marca uma classe como um controlador Spring que manipula solicitações web recebidas.
@RequestMapping(value = "/users"):
Esta anotação é usada no nível de classe para definir um URI base para todos os métodos do
manipulador dentro desse controlador. */
@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    //Injeção de dependências do UserService
    private UserService service;

    //método que responde a requisição do tipo get no caminho /users
    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        User obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
