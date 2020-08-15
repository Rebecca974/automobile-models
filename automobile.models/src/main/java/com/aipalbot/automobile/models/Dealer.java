package com.aipalbot.automobile.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dealer extends Customer{
	public String dealerName;
	public String dealID;
	
	public String item;
	public String quantity;

	
	public Dealer(String name, Address address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}
	
}
