package com.aipalbot.automobile.models;

import java.util.HashMap;
import java.util.Map;

public class Data {
	
	public static Map<Integer, CarRent> reservationDB;
	
	public static void initializaData() {
		if(reservationDB ==null) {
			
			reservationDB = new HashMap<>();
		}
	}

}
