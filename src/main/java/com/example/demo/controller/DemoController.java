package com.example.demo.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Repository.DemoRepo;
import com.example.demo.model.Demo;

@RestController
public class DemoController {
	@Autowired
	private DemoRepo repo;
	
	@PostMapping("/addempdetails")
	public Demo addEmployee(@RequestBody Demo employee) {
		return repo.save(employee);
	}
	
	@GetMapping("/empdetails")
	public List<Demo> getAllEmployees(){
		return repo.findAll();
	}
	
	@GetMapping("/empdetails/{id}")
	public Demo getEmployee(@PathVariable Long id) {
		return repo.findById(id).get();
	}
	
	@PutMapping("/editempdetails/{id}")
	public Demo editEmployee(@RequestBody Demo employee,@PathVariable long id) {
		return repo.save(employee);
	}
	
	@DeleteMapping("/deleteempdetails/{id}")
	public void deleteEmployee(@PathVariable long id) {
		repo.deleteById(id);
	}

}
