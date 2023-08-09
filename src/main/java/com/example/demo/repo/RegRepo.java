package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Registration;

@Repository
public interface RegRepo extends JpaRepository<Registration, Long>{
	
	Registration findByEmail(String email);
	

}
