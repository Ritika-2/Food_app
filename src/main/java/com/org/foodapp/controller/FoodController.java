package com.org.foodapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.foodapp.dto.Food;
import com.org.foodapp.services.FoodService;

@RestController
public class FoodController {
	@Autowired
	FoodService service;
	
	@PostMapping("/food")
	public Food saveFood(@RequestBody Food food) {
		return service.saveFood(food);
	}
	
	@PutMapping("/food")
	public Food updateFood(@RequestBody Food food){
		return service.updateFood(food);
	}
	
	@GetMapping("/food")
	public List<Food> getAllFood(){
		return service.getAllFood();
	}
	
	@GetMapping("/food/{id}")
	public Food getFoodById(@PathVariable int id) {
		return service.getFoodById(id);
	}
	
	@DeleteMapping("/food/{id}")
	public String deleteFood(@PathVariable int id) {
		return service.deleteFood(id);
	}
}
