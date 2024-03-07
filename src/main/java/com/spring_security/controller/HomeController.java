package com.spring_security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring_security.models.Users;
import com.spring_security.service.UserService1;


@RestController
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	private UserService1 userService;
	
	// http://localhost:8081/home/user
	
	
	@GetMapping("/users")
	public List<Users> getUser() {
		System.out.println("getting users");
		return userService.getUsers();
		
	}

}
