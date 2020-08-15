package com.aipalbot.automobile.models;







import java.util.List;
import java.util.Map;

import com.aipalbot.automobile.utils.AutomobileName;
import com.aipalbot.automobile.utils.AutomobileSize;
import com.aipalbot.automobile.utils.Body;
import com.aipalbot.automobile.utils.Color;
import com.aipalbot.automobile.utils.DriverLocation;
import com.aipalbot.automobile.utils.Make;
import com.aipalbot.automobile.utils.ModeOfPayment;
import com.aipalbot.automobile.utils.PaymentMethod;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Automobile {
	private String name;
	private int vin;
	private String engine;
	private String year;
	private String gear;
	private String brake;
	private String weight;
    private String power;
	private String registrationNo;
	private String licenceNo;
	private String dealer;
	private String carRent;
	private List <TypeOfCars> typeOfCar;
	private Map <String,TypeOfCars> typeOfCars;
	private String reservation;
	private  Body body;
	private Make make;
	private DriverLocation location;
	private Color color;
	private AutomobileName automobileName;
	private AutomobileSize automobileSize;
	private ModeOfPayment payment;
	private PaymentMethod method;
	 private double purchasePrice;
	private double sellingCarPrice;
	
	
	
	}
	
	
	
	
	
	
	
	

