package com.ait;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ait.component.Flipkart;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		Flipkart bean = ctx.getBean(Flipkart.class);
		bean.sendCourier(4657, "Navi Mumbai ", "Online");
	}

}
