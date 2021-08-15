package com.syntax.class13;

public class CarTester {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		
		car1.make = "Honda";
		car1.model = "Accord";
		car1.color = "Blue";
		car1.year = 2021;
		
		System.out.println("I have "+car1.make);
		car1.moveForward();
		car1.moveBackword();
		
		System.out.println();
		
		Car car2 = new Car();
		
		car2.make = "Tesla";
		car2.model = "S";
		car2.color = "White";
		car2.year = 2022;
		
		car2.moveForward();
		car2.moveBackword();
		

	}

}
