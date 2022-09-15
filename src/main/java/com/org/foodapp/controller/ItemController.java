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

import com.org.foodapp.dto.Item;
import com.org.foodapp.responseStructure.ResponseStructure;
import com.org.foodapp.services.ItemService;

@RestController
public class ItemController {

	@Autowired 
	ItemService itemService;
	
	
	@PostMapping("/item/{foodOrderId}")
	public ResponseEntity<ResponseStructure<Item>> saveItem(@RequestBody Item item, @PathVariable int foodOrderId){
		return itemService.saveItem(item, foodOrderId);
	}
//	public Item saveItem(@RequestBody Item item) {
//		return itemService.saveItem(item);
//	}
//	
//	@PutMapping("/updateitem")
//	public Item updateItem(@RequestBody Item item) {
//		return itemService.updateItem(item);
//	}
//	
//	@GetMapping("/items")
//	public List<Item> getAll(){
//		return itemService.getAllItems();
//	}
//	
//	@GetMapping("/items/{id}")
//	public Item getItemById(@PathVariable int id) {
//		return itemService.getItemById(id);
//	}
//	
//	@DeleteMapping("/items/{id}")
//	public String deleteItem(@PathVariable int id) {
//		return itemService.deleteItem(id);
//	}
	
}
