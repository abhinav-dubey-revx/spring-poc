package io.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"io.poc" , "io.poc.controller" ,
	"io.poc.entity" , "io.poc.service" , "io.poc.service.impl" , 
	"io.poc.utils"})
@SpringBootApplication
public class PocApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocApplication.class, args);
	}

}
