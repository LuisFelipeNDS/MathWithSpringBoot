package com.Math.exceptions;

import java.io.Serializable;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsupportedMathOperationExcetion extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public UnsupportedMathOperationExcetion(String ex) {
		super(ex);
	}

}
