package com.org.foodapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.org.foodapp.dao.FoodOrderDao;
import com.org.foodapp.dto.FoodOrder;

@Service
public class FoodOrderService {

	@Autowired
	FoodOrderDao foodOrderDao;
	public FoodOrder saveFoodOrder(@RequestBody FoodOrder foodOrder) {
		return foodOrderDao.saveFoodOrder(foodOrder);
	}
	
	public FoodOrder updateFoodOrder(@RequestBody FoodOrder foodOrder) {
		return foodOrderDao.updateFoodOrder(foodOrder);
	}
	
	public List<FoodOrder> getAllFoodOrders(){
		return foodOrderDao.getAllFoodOrders();
	}
	
	public FoodOrder getfoodOrderById( int id) {
		return foodOrderDao.getFoodOrderById(id);
	}
	
	public String delete( int id) {
		return foodOrderDao.delete(id);
	
}
}
