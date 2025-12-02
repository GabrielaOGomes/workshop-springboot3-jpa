package com.educandoweb.couse.config;

import com.educandoweb.couse.entities.User;
import com.educandoweb.couse.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
//popular o banco de dados com objs
public class TestConfig implements CommandLineRunner {

    //injeção de dependência
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        //id null pq será gerado pelo banco de dados
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
