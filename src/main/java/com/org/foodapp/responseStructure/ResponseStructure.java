package com.org.foodapp.responseStructure;

public class ResponseStructure<T> {
	
	private boolean err;
    private String message;
    private int statusCode;
    private T data;
	public boolean isErr() {
		return err;
	}
	public void setErr(boolean err) {
		this.err = err;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
    
    
    
}
