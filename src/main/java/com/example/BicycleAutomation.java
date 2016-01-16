package com.example;

public class BicycleAutomation {

	public static void test(){
		Bicycle bicycle = new Bicycle();
		
		bicycle.increaseSpeed(35);
		
		System.out.println("Bicycle speed is: " +bicycle.getSpeed());
		
		
		bicycle.breakSpeed(10);
		
		System.out.println("Bicycle speed is: " + bicycle.getSpeed());
		
		
	}
	
	public static void main(String[] a){
		test();
	}
}
