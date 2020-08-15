package com.aipalbot.automobile.models;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Toyota extends Automobile {
	
	private int buyOneGetOneFree;

	
	public Toyota(int buyOneCode) {
		this.buyOneGetOneFree = buyOneCode;
		
	}
}
