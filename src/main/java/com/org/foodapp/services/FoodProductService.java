package com.org.foodapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.foodapp.dao.FoodDao;
import com.org.foodapp.dto.Food;

@Service
public class FoodService {
	@Autowired
	FoodDao foodDao;
	 
	public Food saveFood(Food food) {
		return foodDao.saveFood(food);
	}
	
	public Food updateFood(Food food) {
		return foodDao.updateFood(food);
	}
	public List<Food> getAllFood(){
		return foodDao.getAllFood();
	}
	public Food getFoodById(int id) {
		return foodDao.getFoodById(id);
	}
	public String deleteFood(int id) {
		return foodDao.deleteFood(id);
	}
	
	

}
