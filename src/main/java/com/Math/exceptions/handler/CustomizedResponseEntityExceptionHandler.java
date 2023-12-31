package com.Math.exceptions.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.Math.exceptions.ExceptionResponse;
import com.Math.exceptions.UnsupportedMathOperationExcetion;

@RestController
@ControllerAdvice
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	
	//exceçoes mais genericas Exception (Internl Server Error " 500 " )
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ExceptionResponse>
	handleAllExceptions(Exception ex, WebRequest request){
		
		ExceptionResponse exceptionResponse 
		= new ExceptionResponse(new Date(), ex.getMessage(),request.getDescription(false));
		
		return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
	@ExceptionHandler(UnsupportedMathOperationExcetion.class)
	public final ResponseEntity<ExceptionResponse>
	handleBadRequest(Exception ex, WebRequest request){
		
		ExceptionResponse exceptionResponse 
		= new ExceptionResponse(new Date(), ex.getMessage(),request.getDescription(false));
		
		return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);
		
	}
}
