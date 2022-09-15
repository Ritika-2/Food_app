package com.org.foodapp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.org.foodapp.dto.FoodOrder;
import com.org.foodapp.repository.FoodOrderRepository;

@Repository
public class FoodOrderDao {

	@Autowired
	FoodOrderRepository foodOrderRepository;
	
	public FoodOrder saveFoodOrder(FoodOrder foodOrder) {
		return foodOrderRepository.save(foodOrder);
	}
	public Optional<FoodOrder> getFoodOrderById(int id){
		return foodOrderRepository.findById(id);
	
//	public FoodOrder updateFoodOrder(FoodOrder foodOrder) {
//		return foodOrderRepository.save(foodOrder);
//	}
//	
//	public List<FoodOrder> getAllFoodOrders(){
//		return foodOrderRepository.findAll();
//	}
//	public FoodOrder getFoodOrderById(int id) {
//		Optional<FoodOrder> found= foodOrderRepository.findById(id);
//		if(found.isPresent()) {
//			return found.get();
//		}else {
//			return null;
//		}
//	}
//	
//	public String delete(int id) {
//		 FoodOrder foodOrder=getFoodOrderById(id);
//		 if(foodOrder!= null) {
//			 foodOrderRepository.delete(foodOrder);
//			 return  foodOrder.getCustomerName() + " FoodOrder is deleted" ;
//		 }
//		 else {
//			 return  "No FoodOrder is available with specified id " ;
//		 }
	}
}
