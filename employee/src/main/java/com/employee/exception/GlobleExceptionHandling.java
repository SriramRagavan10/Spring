package com.employee.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobleExceptionHandling {

	@ExceptionHandler(value = NoDataException.class)
	public ResponseEntity<Object> NoDataExceptionHandling(NoDataException n) {
		return new ResponseEntity<>(n.getMessage(), HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(value = NullPointerException.class)
	public ResponseEntity<Object> NullPointerExceptionHandling(NullPointerException nul) {
		return new ResponseEntity<>(nul.getMessage(), HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value = AgeNotFoundException.class)
	public ResponseEntity<Object> ageNot(AgeNotFoundException nul) {
		return new ResponseEntity<>(nul.getMessage(), HttpStatus.BAD_REQUEST);
	}

}
