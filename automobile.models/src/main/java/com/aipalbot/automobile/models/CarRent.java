package com.aipalbot.automobile.models;

import com.aipalbot.automobile.utils.Color;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CarRent {
 private int id;
 private String name;
 private TypeOfCars type;
 private Color color;
}
