package com.educandoweb.couse.repositories;

import com.educandoweb.couse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

//instancia um obj repository
public interface UserRepository extends JpaRepository<User,Long> {
}
