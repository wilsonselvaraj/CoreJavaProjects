package com.technextgen.cab.model;

public class CabRequestException extends Exception{

	String message = null;

	public CabRequestException() {
		super();
	}

	public CabRequestException(String message) {
		super(message);
		this.message = message;
	}

	@Override
	public String toString() {
		return message;
	}

	@Override
	public String getMessage() {
		return message;
	}

}
