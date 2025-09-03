package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

/*@RestController:
Esta anotação marca uma classe como um controlador Spring que manipula solicitações web recebidas.
@RequestMapping(value = "/users"):
Esta anotação é usada no nível de classe para definir um URI base para todos os métodos do
manipulador dentro desse controlador. */
@RestController
@RequestMapping(value = "/users")
public class UserResource {

    //método que responde a requisição do tipo get no caminho /users
    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Maria", "maria@gmail.com", "988888888", "12345");
        return ResponseEntity.ok().body(u);
    }
}
