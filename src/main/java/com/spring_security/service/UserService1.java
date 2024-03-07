package com.spring_security.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.spring_security.models.Users;

@Service
public class UserService1 {
	
	private List<Users> store=new ArrayList<>();
	
	public UserService1() {
		store.add(new Users(UUID.randomUUID().toString(),"shweta","shweta@gmail.com"));
		store.add(new Users(UUID.randomUUID().toString(),"swanky","swankyu@gmail.com"));
		store.add(new Users(UUID.randomUUID().toString(),"ashish","ashish@gmail.com"));
		store.add(new Users(UUID.randomUUID().toString(),"mota","mota@gmail.com"));
		
	}
	
	public List<Users> getUsers(){
		return this.store;
	}

}
