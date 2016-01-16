package com.example;

public class Bicycle implements OtherBicycle {

	private Integer speed = 0;
	
	public void increaseSpeed(int incrementBy){
		speed = speed + incrementBy;
	}
	
	public void breakSpeed(int decrementBy){
		speed = speed - decrementBy;
	}
	
	public int getSpeed(){
		return speed;
	}


	@Override
	public void decrementSpeed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testBicycle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void incrementSpeed() {
		// TODO Auto-generated method stub
		
	}
}
