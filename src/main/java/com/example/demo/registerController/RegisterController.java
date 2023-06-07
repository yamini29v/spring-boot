package com.example.demo.registerController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.registerrepo.RegisterRepo;
import com.example.demo.registerModel.Register;

@RestController
public class RegisterController {
	
	
	@Autowired
	private RegisterRepo repo;
	
	@PostMapping("/register")
	public Register postRegUser(@RequestBody Register reguser) {
		return repo.save(reguser);
	}
	
	@GetMapping("/getresponse/{email}/{pass}")
	public String getResponse(@PathVariable("email") String email , @PathVariable("pass") String pass) {
		List<Register> temp=repo.findByEmail(email); 
		if(temp.size()==0) return "wrong mail";
		List<Register> arr=repo.findByEmailAndPassword(email, pass);
		if(arr.size()==0) return "wrong pass";
		else return "ok";
	}

}



