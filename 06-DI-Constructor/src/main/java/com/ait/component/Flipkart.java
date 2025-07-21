package com.ait.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.ait.service.DeliveryService;

@Component
public class Flipkart {
	
	
	private DeliveryService deliveryService;	
    
	/*//setter injection
	@Autowired
	public void setDeliveryService(DeliveryService deliveryService) {
	//public void setDeliveryService(@Qualifier("DTDCServiceImpl") DeliveryService deliveryService) {
		this.deliveryService = deliveryService;
	}*/
	
	//Constructor injection :: in constructor injection, no need of using @Autowired it takes by default
	//public Flipkart(@Qualifier ("blueDartServiceImpl")DeliveryService deliveryService) {//Bytype
	//public Flipkart(@Qualifier ("blueDartByName")DeliveryService deliveryService) {
	public Flipkart(@Qualifier ("DTDCServiceImpl")DeliveryService deliveryService) {//bytype
		
		this.deliveryService = deliveryService;
	}
	
	public void sendCourier(int orderId, String location, String deliveryType) {
		deliveryService.deliverCourier(orderId, location, deliveryType);
	}
}
