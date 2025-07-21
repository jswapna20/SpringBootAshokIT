package com.ait.component;

import org.springframework.stereotype.Component;

import com.ait.service.DeliveryService;

@Component
public class Flipkart {
	
	DeliveryService deliveryService;	
    
	public void setDeliveryService(DeliveryService deliveryService) {
		this.deliveryService = deliveryService;
	}
	
	public void sendCourier(int orderId, String location, String deliveryType) {
		deliveryService.deliverCourier(orderId, location, deliveryType);
	}
}
