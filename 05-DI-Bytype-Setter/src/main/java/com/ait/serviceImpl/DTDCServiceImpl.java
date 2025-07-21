package com.ait.serviceImpl;

import org.springframework.stereotype.Service;

import com.ait.service.DeliveryService;

@Service
public class DTDCServiceImpl implements DeliveryService {

	@Override
	public void deliverCourier(int orderId, String location, String deliveryType) {
		System.out.println("DTDC and order Id is ::" +orderId +"Location is :" +location +"payment mode is ::" +deliveryType);		
	}	

}
