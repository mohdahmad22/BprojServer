package com.makcom.in.BProj.controller;

import com.makcom.in.BProj.JPA.UserJpa;
import com.makcom.in.BProj.User.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

	private UserJpa jpaRepo;

	public MyController(UserJpa jpaRepo) {
		this.jpaRepo = jpaRepo;
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/user")
	public List<User> getStarted() {
		return jpaRepo.findAll();
	}
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/user")
	public void Save(@RequestBody User user){
		jpaRepo.save(user);
	}

}
