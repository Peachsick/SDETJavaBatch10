package com.syntax.class13;

public class Cat {

	String name; 
	String color;
	int age;
	
	void eat() {
		System.out.println(name+" is eating ");
	}
	
	void sleep() {
		System.out.println(name+" is sleepinh");
	}
	
	
	public static void main(String[] args) {
		
		Cat cat1 = new Cat();
		cat1.name = "Tom";
		cat1.color = "Red";
		cat1.age = 16;
		
		cat1.eat();
		cat1.sleep();

		Cat cat2 = new Cat();
		cat2.name = "Jerry";
		cat2.color = "Brown";
		cat2.age = 12;
		
		cat2.eat();
		cat2.sleep();
	}

}
