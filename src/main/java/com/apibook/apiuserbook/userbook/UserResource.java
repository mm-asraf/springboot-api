package com.apibook.apiuserbook.userbook;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserResource {
	
	private UserDaoService service;
	
	public UserResource(UserDaoService service) {
		this.service = service;
	}
	
	//GET /users
	@GetMapping("/api/v1/users")
	public List<User> retrievAllUsers() {
		return service.findAll();
	}
	
	@GetMapping("/api/v1/users/{id}")
	public User retrieveUser(@PathVariable int id) {
		return service.findOne(id);
	}
	
	
}
