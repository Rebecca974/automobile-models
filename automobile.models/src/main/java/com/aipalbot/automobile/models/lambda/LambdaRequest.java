package com.aipalbot.automobile.models.lambda;

import com.aipalbot.automobile.models.Customer;
import com.aipalbot.automobile.models.TypeOfCars;
import com.aipalbot.automobile.utils.Color;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LambdaRequest {

	private Customer customer;
	private TypeOfCars type;
	private Color color;
	private String carName;
	
}
