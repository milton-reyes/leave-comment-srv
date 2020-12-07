package com.yukaju.exceptions;

public class HttpStatusException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	private int statusCode;
	
	public int getStatusCode() {
		return statusCode;
	}

	public HttpStatusException(int statusCode) {
		super();
		this.statusCode = statusCode;
	}
	
		

}
