package com.ait.service;

import org.springframework.stereotype.Service;

@Service
public interface DeliveryService {
	
	public void deliverCourier(int orderId, String location, String deliveryType);

}
