package com.aipalbot.automobile.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public  abstract class Customer {

	private String name;
	private Address address;
	
	
	public Customer(String name, Address address) {
		this.name = name;
		this.address = address;
		
	}
}
