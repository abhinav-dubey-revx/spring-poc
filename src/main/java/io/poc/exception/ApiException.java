package io.poc.exception;

public class ApiException extends RuntimeException {

	private static final long serialVersionUID = 7825483267691674110L;

	public ApiException(String msg) {
		super(msg);
	}

}
