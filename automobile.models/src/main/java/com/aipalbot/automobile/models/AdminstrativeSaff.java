package com.aipalbot.automobile.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdminstrativeSaff extends Customer{
	
	public AdminstrativeSaff(String name, Address address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}
	private String staffID;
	private String name;
	private Address address;
	private int phoneNumber;
	private String emailID;
	
	
	
}
