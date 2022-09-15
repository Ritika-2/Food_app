package com.org.foodapp.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.foodapp.dao.FoodProductDao;



@Service
public class FoodProductService {
	
	@Autowired
	FoodProductDao foodProductDao;
	
	// @Autowired MenuDao menuDao;
	
	
	
	
	
	

}
