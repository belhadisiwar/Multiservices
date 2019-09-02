package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Admin;
import com.example.demo.entities.User;

@Repository("UserRepositories")
public interface UserRepositories  extends JpaRepository<User, Integer>{


}
