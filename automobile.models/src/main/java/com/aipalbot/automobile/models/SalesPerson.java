package com.aipalbot.automobile.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class SalesPerson extends Customer{
	
	public String salesPersonID;
	public String name;
	
	
	public SalesPerson(String name, Address address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}
}
