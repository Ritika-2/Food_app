package com.org.foodapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.org.foodapp.dao.UserDao;

@Service
public class UserService {
	
	@Autowired
	UserDao userDao;
	
	//public ResponseEntity<ResponseSt>

}
