package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Registration {
	
	@Id
    private String email;
	@Column
	 private String username;
     @Column
	 private String password;
    public String getemail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void  setPassword(String password) {
		this.password = password;
	}

   

}
