package com.ait.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.ait.service.DeliveryService;

@Component
public class Flipkart {
	
	@Autowired
	//@Qualifier("blueDartServiceImpl")
	
	@Qualifier("DTDCServiceImpl")

	private DeliveryService deliveryService;	
	
	
	
	public void sendCourier(int orderId, String location, String deliveryType) {
		deliveryService.deliverCourier(orderId, location, deliveryType);
	}
}

//////////

/*
 
DTDCServiceImpl :: 0 param constructor
Flipkart :: 1 param constructor
BlueDartServiceImpl :: 0 param constructor
[2m2025-07-21T19:57:03.308+05:30[0;39m [32m INFO[0;39m [35m24168[0;39m [2m--- [05-DI-Bytype-Setter] [           main] [0;39m[36mo.s.b.w.embedded.tomcat.TomcatWebServer [0;39m [2m:[0;39m Tomcat started on port 4545 (http) with context path '/'
[2m2025-07-21T19:57:03.316+05:30[0;39m [32m INFO[0;39m [35m24168[0;39m [2m--- [05-DI-Bytype-Setter] [           main] [0;39m[36mcom.ait.Application                     [0;39m [2m:[0;39m Started Application in 1.936 seconds (process running for 2.675)
DTDC and order Id is ::4657Location is :Navi Mumbai payment mode is ::Cash

 
 
 */
