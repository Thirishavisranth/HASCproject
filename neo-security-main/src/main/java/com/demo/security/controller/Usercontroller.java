package com.demo.security.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.security.entity.User;
import com.demo.security.service.UserServiceImpl;



@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/v4/user")
public class Usercontroller {

	@Autowired
	private UserServiceImpl service;

	@GetMapping("/get")
	public List<User> getUsers(){
		return service.getAllUsers();
	}
	
	@GetMapping("/get/{email}")
	public User getUserByEmail(@PathVariable String email){
		return service.getUserByEmail(email);
	}
	
//	@PutMapping("/update/{email}")
//    public User updateUserByEmail(@PathVariable String email, @RequestBody User updatedUser) {
//        // Find the user in the database based on the email
//        User userToUpdate = service.getUserByEmail(email);
//        if (userToUpdate == null) {
//            // Handle error if user not found
//            // For simplicity, you can throw an exception or return an error response
//            throw new NotFoundException("User not found");
//        }
//
//        // Update the user object with the new data from the updatedUser object
//        userToUpdate.setUsername(updatedUser.getUsername());
//        userToUpdate.setMobileNumber(updatedUser.getMobileNumber());
//
//        // Save the updated user object to the database
//        return service.saveUser(userToUpdate);
//    }
	
	
}
