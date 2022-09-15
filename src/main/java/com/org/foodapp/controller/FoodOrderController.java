package com.org.foodapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.foodapp.dto.FoodOrder;
import com.org.foodapp.responseStructure.ResponseStructure;
import com.org.foodapp.services.FoodOrderService;

@RestController
public class FoodOrderController {

	@Autowired
	FoodOrderService foodOrderService ;
	
	@PostMapping("/foodorder")
	public ResponseEntity<ResponseStructure<FoodOrder>> saveFoodOrder(@RequestBody FoodOrder foodOrder){
		return foodOrderService.saveFoodOrder(foodOrder, 1);
	}
	
//	@PostMapping("/foodOrder")
//	public FoodOrder saveFoodOrder(@RequestBody FoodOrder foodOrder) {
//		return foodOrderService.saveFoodOrder(foodOrder);
//	}
//	
//	@PutMapping("/updatefoodorder")
//	public FoodOrder updateFoodOrder(@RequestBody FoodOrder foodOrder) {
//		return foodOrderService.updateFoodOrder(foodOrder);
//	}
//	
//	@GetMapping("/foodorders")
//	public List<FoodOrder> getAll(){
//		return foodOrderService.getAllFoodOrders();
//	}
//	
//	@GetMapping("/foodorders/{id}")
//	public FoodOrder getfoodOrderById(@PathVariable int id) {
//		return foodOrderService.getfoodOrderById(id);
//	}
//	
//	@DeleteMapping("/foodorders/{id}")
//	public String delete(@PathVariable int id) {
//		return foodOrderService.delete(id);
//	}
}
