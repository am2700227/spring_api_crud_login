package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Registration;
import com.example.demo.repo.RegRepo;

@Service
public class RegService {
	  @Autowired
	    private RegRepo regRepository;

	    public Registration findByEmail(String email) {
	        return regRepository.findByEmail(email);
	        
	    }

	    public Registration  saveUser(Registration user) {
	        return regRepository.save(user);
	    }

}
