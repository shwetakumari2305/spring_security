package com.spring_security.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Users {
	
	private String userid;
	
	private String name;
	
	private String email;
	

}
