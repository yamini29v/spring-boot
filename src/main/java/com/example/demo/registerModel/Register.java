package com.example.demo.registerModel;

import javax.persistence.*;


@Entity
public class Register {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long regUserId;
	private String name;
	private String email;
	private String password;
	public long getRegUserId() {
		return regUserId;
	}
	public void setRegUserId(long regUserId) {
		this.regUserId = regUserId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Register(long regUserId, String name, String email, String password) {
		super();
		this.regUserId = regUserId;
		this.name = name;
		this.email = email;
		this.password = password;
	}
	public Register() {
		super();
		
	}
	
}
