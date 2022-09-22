package com.org.foodapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.org.foodapp.services.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
//	@PostMapping("/users")
//	public ResponseEntity<>
	

}
