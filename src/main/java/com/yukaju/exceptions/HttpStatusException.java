package com.yukaju.exceptions;

public class HttpStatusException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	private int statusCode;
	private String message;
	
	public int getStatusCode() {
		return statusCode;
	}
	
	public String getMessage() {
		return message;
	}

	public HttpStatusException(int statusCode, String message) {
		super();
		this.statusCode = statusCode;
		this.message = message;
	}
	
		

}
