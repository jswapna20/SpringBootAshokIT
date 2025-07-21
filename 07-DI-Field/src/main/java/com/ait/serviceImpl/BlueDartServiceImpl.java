package com.ait.serviceImpl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.ait.service.DeliveryService;

//@Service(value = "blueDartByName")
 @Service
//@Primary //(In constructor based:: when DTDC bean is injected in @Qualifier in Flipkart & Bluedart is set as @Primary,---it will inject DTDC, Since auto inject in constructor in constructor based )
public class BlueDartServiceImpl implements DeliveryService{
	
	public BlueDartServiceImpl() {
		System.out.println("BlueDartServiceImpl :: 0 param constructor");

	}
	
	@Override
	public void deliverCourier(int orderId, String location, String deliveryType) {
		System.out.println("BlueDart and order Id is ::" +orderId +"Location is :" +location +"payment mode is ::" +deliveryType);		
	}	

}
