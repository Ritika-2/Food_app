package com.org.foodapp.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.org.foodapp.dto.Menu;
import com.org.foodapp.services.MenuService;

@RestController
public class MenuController {
	@Autowired
	MenuService service;
	
	@PutMapping("/menu")
	public Menu updateMenu(@RequestBody Menu menu){
		return service.updateMenu(menu);
	}
	
	@GetMapping("/menu")
	public List<Menu> getAllMenu(){
		return service.getAllMenu();
	}
	
	@GetMapping("/menu/{id}")
	public Menu getMenuById(@PathVariable int id) {
		return service.getMenuById(id);
	}
	
	@DeleteMapping("/menu/{id}")
	public String deleteMenu(@PathVariable int id) {
		return service.deleteMenu(id);
	}
}
