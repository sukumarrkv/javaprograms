package com.spring.microservices.exception;

public class DeviceNotCreatedException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DeviceNotCreatedException(String message){
		super(message);
	}
}
