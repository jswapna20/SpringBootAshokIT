package com.ait.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.ait.service.DeliveryService;

@Component
public class Flipkart {
	
	
	private DeliveryService deliveryService;	
    
	@Autowired
	public void setDeliveryService(@Qualifier("dtdcServiceByName") DeliveryService deliveryService) {
		this.deliveryService = deliveryService;
	}
	
	public void sendCourier(int orderId, String location, String deliveryType) {
		deliveryService.deliverCourier(orderId, location, deliveryType);
	}
}
