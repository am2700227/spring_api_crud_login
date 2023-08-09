package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.Registration;
//import com.example.demo.entity.User;
import com.example.demo.services.RegService;
//import com.example.demo.services.UserService;
@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
//	private UserService userService;
//    @Autowired 
	private RegService regService;
//	@PostMapping("/login")
//	public ResponseEntity<String> login(@RequestBody Map<String, String> loginData) {
//		String username = loginData.get("username");
//		String password = loginData.get("password");
//
//		// Check if the user exists in the database
//		User user = userService.findByUsername(username);
//		if (user == null) {
//			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password");
//		}
//
//		// Check if the password matches
//		if (!password.equals(user.getPassword())) {
//			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password");
//		}
//
//		return ResponseEntity.ok("Login successful!");
//	}
	
	@PostMapping("/registration")
	public String registration(@RequestBody Registration registrationData ) {
		// Check if the user exists in the database
		System.out.println(registrationData.toString());
		regService.saveUser(registrationData);
		return "data";
	}
		
		@GetMapping("/registration/{email}")
		public Registration getUsers(@PathVariable String email) {
			// Check if the user exists in the database
			
			return regService.findByEmail(email);
		
	}
}
