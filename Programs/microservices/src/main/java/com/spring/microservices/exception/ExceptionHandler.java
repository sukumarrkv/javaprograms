package com.spring.microservices.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.spring.microservices.response.ErrorResponse;

@RestControllerAdvice
public class ExceptionHandler extends ResponseEntityExceptionHandler{

	@org.springframework.web.bind.annotation.ExceptionHandler(DeviceNotCreatedException.class)
	public ResponseEntity<ErrorResponse> handleDeviceNotCreatedException(DeviceNotCreatedException e){
			ErrorResponse errorResponse = new ErrorResponse();
			errorResponse.setMessage("Internal Server Error");
			errorResponse.setStatus(500);
			errorResponse.setTime(new Date());
			return new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
	@org.springframework.web.bind.annotation.ExceptionHandler(DeviceNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleDeviceNotFoundException(DeviceNotFoundException e){
			ErrorResponse errorResponse = new ErrorResponse();
			errorResponse.setMessage(e.getMessage());
			errorResponse.setStatus(404);
			errorResponse.setTime(new Date());
			return new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.NOT_FOUND);
		
	}
}
