package com.tcl.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class MainApp {

	@Bean
	GreetingService SayHello(){
		return new GreetingMsg();
	}

	public static void main(String ar[]){
		ApplicationContext context = new AnnotationConfigApplicationContext(MainApp.class);
		
		GreetingService service = context.getBean(GreetingService.class);
		
		System.out.println(service.sayToResponse());
	}
	
}
