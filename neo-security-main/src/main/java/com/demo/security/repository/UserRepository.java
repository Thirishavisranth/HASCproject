package com.demo.security.repository;

//import java.lang.StackWalker.Option;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.security.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	Optional<User> findByEmail(String email);
}
