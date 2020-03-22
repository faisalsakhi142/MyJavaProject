package com.syntax.class03;

public class TemperatureCheck {

	public static void main(String[] args) {
		//Create a Java program and name it Temperature Check. Create variable to store temperature. Your program should check if temperature is below 32 then
		//it should print
		//“Water will freeze with temperature __“, otherwise “Water will NOT freeze with temperature __“

		int temperature=40;
		int freezetemperature=32;
		if(temperature<32){
		System.out.println("Water will freeze with temperature "+temperature);
		}else {
			System.out.println("Water will not freeze with temperature "+temperature);
		}
	}
	}
