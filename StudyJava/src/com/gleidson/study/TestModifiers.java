package com.gleidson.study;

class Cloth
{
	final int MAX_PRICE = 999;
	final int MIN_PRICE = 699;
	final void display() {
		System.out.println("Max Price is " + MAX_PRICE);
		System.out.println("Min Price is " + MIN_PRICE);	
	}
}

final class Abc
{
	int a = 10;
	void show() {
		System.out.println(a);
	}
}


public class TestModifiers {
	final int a = 10;

	public static void main(String[] args) {
		TestModifiers test = new TestModifiers();
		
		System.out.println(test instanceof TestModifiers);
			
		
	}
	
}
