package com.ait;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ait.util.WishGenerator;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
	
	    WishGenerator wg = (WishGenerator) ctx.getBean(WishGenerator.class);
	    wg.generateWish();
	}

}
