package com.ait.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class StudentEntity {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String stream;
	private long contactNo;
	//private int contactNo;
	private String address;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	
	public Long getContactNo() {
		return contactNo;
	}
	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}
	
    //added 
//	public int getContactNo() {
//		return contactNo;
//	}
//	public void setContactNo(int contactNo) {
//		this.contactNo = contactNo;
//	}
	////
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", name=" + name + ", stream=" + stream + ", contactNo=" + contactNo
				+ ", address=" + address + "]";
	}


}
