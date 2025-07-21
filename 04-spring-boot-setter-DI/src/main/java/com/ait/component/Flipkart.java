package com.ait.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ait.service.DTDCService;

@Component
public class Flipkart {
	
	private DTDCService dtdcService;

	@Autowired
	public void setDtdcService(DTDCService dtdcService) {
		this.dtdcService = dtdcService;
	}
	
	public void placeOrder(int orderId, String location) {
		
		dtdcService.delivery(orderId, location);
		
	}

}
