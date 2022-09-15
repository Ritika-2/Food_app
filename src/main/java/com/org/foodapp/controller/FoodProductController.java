package com.org.foodapp.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;

import com.org.foodapp.services.FoodProductService;

@RestController
public class FoodProductController {
	@Autowired
	FoodProductService foodProductService;
	
	// @PostMapping("/foodproducts")
	
	
	
}
