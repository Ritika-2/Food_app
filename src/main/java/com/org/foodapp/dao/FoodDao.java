package com.org.foodapp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.org.foodapp.dto.Food;
import com.org.foodapp.repository.foodRepository;

@Repository
public class FoodDao {
	@Autowired
	foodRepository foodRepository;
	public Food saveFood(Food food)
	{
		return foodRepository.save(food);
	}
	public Food updateFood(Food food) {
		return foodRepository.save(food);
	}
	
	public List<Food> getAllFood(){
		return foodRepository.findAll();
	}
	
	public Food getFoodById(int id){
		Optional<Food> found =	foodRepository.findById(id);
		if(found.isPresent()) {
			return found.get();
		}else {
			return null;
		}
	
	}
	
	public String deleteFood(int id) {
		Food food = getFoodById(id);
		if(food != null) {
			foodRepository.delete(food);
			return food.getName() + "Food item is deleted";
		}else {
			return  "No Food item is available with specified ID";
		}
	}
	
	

}
