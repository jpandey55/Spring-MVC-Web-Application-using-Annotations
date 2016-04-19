package com.jeet.studentadmissioncontroller;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice

public class GlobalExceptionHandlerMethods {

	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=IOException.class)
	public String handleIOException(Exception e){
		System.out.println("Exception Occured: "+e);
		return "IOException"; 
	}
	
	
	@ExceptionHandler(value=Exception.class)
	public String handleException(Exception e){
		System.out.println("Unknown Exception Occured: "+e);
		return "Exception"; 
	}
}
