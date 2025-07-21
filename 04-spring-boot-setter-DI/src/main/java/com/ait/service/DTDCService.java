package com.ait.service;

import org.springframework.stereotype.Service;

@Service
public class DTDCService {
	
	public void delivery(int orderId, String location) {
		System.out.println("DTDCService orderId==" +orderId +"& its delivery on location ::" +location);
	}

}
