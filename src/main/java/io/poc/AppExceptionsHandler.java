package io.poc;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class AppExceptionsHandler {

	// returning PocServiceException
//	@ExceptionHandler(PocServiceException.class)
//	public ResponseEntity<Object> handlePocServiceException(PocServiceException ex, WebRequest req) {
//		return new ResponseEntity<>(ex.getMessage(), new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
//	}

	
	// return custom object
	@ExceptionHandler(PocServiceException.class)
	public ResponseEntity<Object> handlePocServiceException(PocServiceException ex, WebRequest req) {
		ErrorMessage errMsg = new ErrorMessage(new Date() , ex.getMessage());
		
		return new ResponseEntity<>(errMsg, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

	
	// handles other exception
		@ExceptionHandler(Exception.class)
		public ResponseEntity<Object> handleOtherException(Exception ex, WebRequest req) {
			ErrorMessage errMsg = new ErrorMessage(new Date() , ex.getMessage());
			
			return new ResponseEntity<>(errMsg, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
}
