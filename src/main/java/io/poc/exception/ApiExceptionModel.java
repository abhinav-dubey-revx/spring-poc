package io.poc.exception;

import org.springframework.http.HttpStatus;

public class ApiExceptionModel {
	
	private long id;
	private String description;
	private HttpStatus httpStatus;
	
	public ApiExceptionModel() {
	}
	
	public ApiExceptionModel(long id, String description, HttpStatus httpStatus) {
		this.id = id;
		this.description = description;
		this.httpStatus = httpStatus;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
	
	
	
	

}
