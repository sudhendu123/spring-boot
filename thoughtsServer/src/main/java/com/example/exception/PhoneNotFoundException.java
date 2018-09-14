package com.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PhoneNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3870251844306421522L;

	public PhoneNotFoundException(String exception){
		super(exception);
	}
}
