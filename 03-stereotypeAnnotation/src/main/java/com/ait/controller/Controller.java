package com.ait.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.ait.service.Service;

@org.springframework.stereotype.Controller
public class Controller {
	@Autowired
	Service service;
	
	public Integer calculator(int a, int b) {
		
		Integer output = service.performCalculation(a,b);
		return output;
		
	}

}
