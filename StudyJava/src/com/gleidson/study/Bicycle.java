package com.gleidson.study;

public class Bicycle implements Veichle {
	int speed;
	int gear;
	
	@Override
	public void changeGear(int newGear) {
		gear = newGear;
	}
	@Override	
	public void speedUp(int increment) {
		speed += increment;
	}
	@Override
	public void applyBreakes(int decrement) {
		speed -= decrement;
	}
	
	public void printStates() {
		System.out.println("Speed" + speed + "Gear" + gear);
	}
}
