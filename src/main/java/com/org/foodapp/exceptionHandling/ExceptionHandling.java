//package com.org.foodapp.exceptionHandling;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
//
//import com.org.foodapp.responseStructure.ResponseStructure;
//
//@ControllerAdvice
//public class ExceptionHandling extends ResponseEntityExceptionHandler {
//	@ExceptionHandler(Item.class)
//	public ResponseEntity<ResponseStructure<String>> itemNotFound(Item item){
//		ResponseStructure<String> responseStructure=new ResponseStructure<String>();
//		responseStructure.setMessage(item.getMessage());
//		//responseStructure.setStatuscode(HttpStatus.NOT_FOUND.value());
//		responseStructure.setData("Item Unavailable");
//		return new ResponseEntity<ResponseStructure<String>>(responseStructure,HttpStatus.NOT_FOUND);
//	}
//	
//	@ExceptionHandler(Menu.class)
//	public ResponseEntity<ResponseStructure<String>> menuNotFound(Menu menu){
//		ResponseStructure<String> responseStructure=new ResponseStructure<String>();
//		responseStructure.setMessage(menu.getMessage());
//		//responseStructure.setStatuscode(HttpStatus.NOT_FOUND.value());
//		responseStructure.setData("Menu not found");
//		return new ResponseEntity<ResponseStructure<String>>(responseStructure,HttpStatus.NOT_FOUND);
//	}
//	@ExceptionHandler(ProductNotFound.class)
//	public ResponseEntity<ResponseStructure<String>> productNotFoundException(ProductNotFound found){
//		ResponseStructure<String> responseStructure=new ResponseStructure<String>();
//		responseStructure.setMessage(found.getMessage());
//		//responseStructure.setStatuscode(HttpStatus.NOT_FOUND.value());
//		responseStructure.setData("Product not available now");
//		return new ResponseEntity<ResponseStructure<String>>(responseStructure,HttpStatus.NOT_FOUND);
//	}
//}
