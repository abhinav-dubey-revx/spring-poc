package io.poc.utils;

import java.util.Random;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import io.poc.exception.ApiException;
import io.poc.exception.ErrorMessages;
import io.poc.model.PocRequestModel;

@Service
public class Helper {

	public long getRandomUserId(){
		Random r = new Random();

		long sendId = r.nextInt(10000);

		return sendId;
	}

	public void validateCreateRequest(PocRequestModel advertiserReq){
		try {
			if(advertiserReq.getName().isEmpty()) {
				throw new ApiException("name missing");

			}	
		}catch(ApiException e) {

		}


	}

}
