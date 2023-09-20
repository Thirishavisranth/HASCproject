package com.demo.security.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.demo.security.entity.User;
import com.demo.security.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository repo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	public Boolean addUser(User user) {
		
		String encodedPassword = passwordEncoder.encode(user.getPassword());
		
		User user1 = User.builder()
				
				.username(user.getUsername())
				.password(encodedPassword)
				.email(user.getEmail())
				
				.mobileNumber(user.getMobileNumber()).build();
		
		return repo.save(user1)!=null ? true:false;
	}

	@Override
	
	public List<User> getAllUsers() {
		return repo.findAll();
	}

	@Override
	public User getUserByEmail(String email) {
	
		return repo.findByEmail(email).get();
	}
	
//	public User saveUser(User user) {
//        return repo.save(user);
//    }
	
	

}
