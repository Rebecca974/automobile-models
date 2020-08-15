package com.aipalbot.automobile.models;

import lombok.Getter;
import lombok.Setter;


@Getter

public class Ford extends Automobile {
	
private double discount;

public Ford(double disc) {
	this.discount = disc;
}


}
