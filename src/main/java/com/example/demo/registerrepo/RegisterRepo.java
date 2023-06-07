package com.example.demo.registerrepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.registerModel.Register;

public interface RegisterRepo extends JpaRepository<Register, Long> {
	
	List<Register> findByEmailAndPassword(String email,String password);
	
	List<Register> findByEmail(String email);

}
