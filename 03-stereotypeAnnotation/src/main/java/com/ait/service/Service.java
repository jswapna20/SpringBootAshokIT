package com.ait.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.ait.repository.Repository;

@org.springframework.stereotype.Service
public class Service {
	
	@Autowired
	Repository repository;

	public Integer performCalculation(int a, int b) {
		// TODO Auto-generated method stub
		Integer output = repository.getTheOutput(a,b);
		return output;
	}

}
