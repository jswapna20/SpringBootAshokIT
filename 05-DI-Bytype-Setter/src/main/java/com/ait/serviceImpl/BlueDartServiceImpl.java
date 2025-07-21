package com.ait.serviceImpl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.ait.service.DeliveryService;

//@Service(value = "blueDartByName")
@Service
//@Primary
public class BlueDartServiceImpl implements DeliveryService{
	
	@Override
	public void deliverCourier(int orderId, String location, String deliveryType) {
		System.out.println("BlueDart and order Id is ::" +orderId +"Location is :" +location +"payment mode is ::" +deliveryType);		
	}	

}
