package io.poc.utils;

import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import io.poc.controller.PocController;
import io.poc.exception.ApiException;
import io.poc.exception.ErrorMessages;
import io.poc.model.PocRequestModel;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

@Service
public class Helper {

	private static final Logger logger = LogManager.getLogger(Helper.class) ;//getRootLogger();// (PocController.class);


	public long getRandomUserId(){
		Random r = new Random();

		long sendId = r.nextInt(10000);

		return sendId;
	}

	public void validateCreateRequest(PocRequestModel advertiserReq){
		//		try {
		if(advertiserReq.getName().endsWith("z") ) {
			throw new ApiException("name missing");

		}	
		//		}catch(ApiException e) {
		//
		//		}


	}


	public void logMe() {
		logger.trace("trace - HELPER !!!");
		logger.debug("Debug - HELPER !!!!");
		logger.info("info - HELPER !!!!");
		logger.warn("warn - HELPER !!!!");
		logger.error("error - HELPER !!!!");
		logger.fatal("fatal - HELPER !!!!");

	}

}
