package com.org.foodapp.services;

import java.util.Optional;

import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.org.foodapp.dao.FoodOrderDao;
import com.org.foodapp.dao.UserDao;
import com.org.foodapp.dto.FoodOrder;
import com.org.foodapp.responseStructure.ResponseStructure;

@Service
public class FoodOrderService {

	@Autowired
	FoodOrderDao foodOrderDao;
	
	@Autowired
	UserDao userDao;
	
	public ResponseEntity<ResponseStructure<FoodOrder>> saveFoodOrder(FoodOrder foodOrder, int id){
		Optional<User> optional = userDao.getUserById(id);
		if(optional.isEmpty()) {
			System.out.println("No id is found");
		}else {
			foodOrder.setUser(optional.get());
		}
		ResponseStructure<FoodOrder> structure = new ResponseStructure<>();
		structure.setErr(false);
		structure.setMessage("Food order placed");
		structure.setData(foodOrderDao.saveFoodOrder(foodOrder));
	}
	
//	public FoodOrder saveFoodOrder(@RequestBody FoodOrder foodOrder) {
//		return foodOrderDao.saveFoodOrder(foodOrder);
//	}
//	
//	public FoodOrder updateFoodOrder(@RequestBody FoodOrder foodOrder) {
//		return foodOrderDao.updateFoodOrder(foodOrder);
//	}
//	
//	public List<FoodOrder> getAllFoodOrders(){
//		return foodOrderDao.getAllFoodOrders();
//	}
//	
//	public FoodOrder getfoodOrderById( int id) {
//		return foodOrderDao.getFoodOrderById(id);
//	}
//	
//	public String delete( int id) {
//		return foodOrderDao.delete(id);
//	
//}
}
