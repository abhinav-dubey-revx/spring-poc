package io.poc.exception;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class ApiExceptionsHandler {

	
	@ExceptionHandler(value = {ApiException.class})
	public ResponseEntity<Object> handleApiException(ApiException e){
		
		HttpStatus badRequest = HttpStatus.BAD_REQUEST;
		
		ApiExceptionModel apiExceptionModel = 
				new ApiExceptionModel(badRequest.value() , e.getMessage(),badRequest);
		
		return new ResponseEntity<>(apiExceptionModel , badRequest); 
		
	}
}
