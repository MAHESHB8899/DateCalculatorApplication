package com.DateCalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DateCalculatorApplication  extends SpringBootServletInitializer {



	public static void main(String[] args) {
		SpringApplication.run(DateCalculatorApplication.class, args);
		System.out.println("Inside java");
		
	}
	
	  @Override
	  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
	    return builder.sources(DateCalculatorApplication.class);
	  }

}
