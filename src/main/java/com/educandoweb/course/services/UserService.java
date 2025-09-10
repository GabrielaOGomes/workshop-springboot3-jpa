package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repository.UserRepository;

@Service    
//A anotação @Service indica que essa classe é um componente
// de serviço no Spring
public class UserService {
    
    //Injeção de dependência de UserRepository
    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }

    //inserir no banco de dados novo usuário
    public User insert(User obj) {
        return repository.save(obj);
    }
    //deletar usuário do banco de dados
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
