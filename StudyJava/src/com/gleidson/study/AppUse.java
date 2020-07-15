package com.gleidson.study;

public class AppUse {
	public static void main(String[] args) {
		
		Bicycle bicycle = new Bicycle();
		bicycle.changeGear(3);
		bicycle.speedUp(50);
		bicycle.applyBreakes(25);
		
		System.out.println("Bicycle Present State : ");
		bicycle.printStates();
	}
}
