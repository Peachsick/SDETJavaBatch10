package com.syntax.class13;

public class Dog {

	String name; // these are properties in a class
	String breed;
	String color;
	int age;
	double height;
	char gender;
	
	void bark() { // bark is a behavior
		System.out.println("Dog can bark");
	}
	
	void sleep() { // sleep is a behavior
		System.out.println("Dog can sleep");
	}
	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		dog1.name = "james";
		dog1.breed = "Bull dog";
		dog1.color = "White";
		dog1.age = 20;
		dog1.height = 15.75;
		dog1.gender = 'M';
		
		dog1.bark();
		dog1.sleep();
		
		Dog dog2 = new Dog();
		
		dog2.name = "Bongo";
		dog2.breed = "shitzu";
		dog2.color = "Blue";
		dog2.age = 2;
		dog2.height = 64.34;
		dog2.gender = 'F';
		
		dog2.sleep();
		
		
	}

}
