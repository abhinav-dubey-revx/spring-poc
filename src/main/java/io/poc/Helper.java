package io.poc;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Helper {
	
	public long getRandomUserId(){
		Random r = new Random();
		
		long sendId = r.nextInt(10000);
		
		return sendId;
	}

}
