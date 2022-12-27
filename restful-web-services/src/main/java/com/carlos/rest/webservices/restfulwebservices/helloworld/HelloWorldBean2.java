package com.carlos.rest.webservices.restfulwebservices.helloworld;

public class HelloWorldBean2 {
	
	private String message;
	
	public HelloWorldBean2(String message) {
		this.message=message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWorldBean2 [message=" + message + "]";
	}
	
	

}
