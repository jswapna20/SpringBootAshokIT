package com.ait;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ait.controller.Controller;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		 ConfigurableApplicationContext ctx =  SpringApplication.run(Application.class, args);
		 Controller cnt = ctx.getBean(Controller.class);
		 
		 Integer x = cnt.calculator(5,6);
		 System.out.println("The output is : " +x);
	}

}
