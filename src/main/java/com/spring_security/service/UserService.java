package com.spring_security.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring_security.models.User;


@Service
public class UserService {
	
	List<User> list = new ArrayList<>();

	public UserService() {
		list.add(new User("abc" ,"abc" ,"abc@gmail.com"));
		list.add(new User("xz" ,"abs" ,"zx@gmail.com"));
		list.add(new User("she" ,"sweet", "she@gmail.com"));
	}
	
	//get all user
	
	public List<User> getAllUsers(){
		return this.list;
	}
	
	//get single users
	
	public User getUser(String username)
	{
		return this.list.stream().filter((user)->user.getUsername().equals(username)).findAny().orElse(null);
	}
	
	//add new user
	public User addUser(User user) {
		this.list.add(user);
		return user;
	}

}
