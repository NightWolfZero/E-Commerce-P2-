package com.revature.ecommerce.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Users {
	@Id
	@GeneratedValue
	private int id;
	private String email;
	private String password;
	private String role;
	private boolean enabled;


	public Users(String email, String password, boolean enabled) {
		super();
		this.email = email;
		this.password = password;
		this.enabled = enabled;
	}
	
	
	
}
	
	
	

