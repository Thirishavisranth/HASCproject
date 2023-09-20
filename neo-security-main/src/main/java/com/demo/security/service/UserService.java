package com.demo.security.service;

import java.util.List;

import com.demo.security.entity.User;


public interface UserService {
	
	Boolean addUser(User user);

	List<User> getAllUsers();
	
	User getUserByEmail(String email);
}
