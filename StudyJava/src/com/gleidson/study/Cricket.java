/*
 * Dynamic Method Dispatch
 * */

package com.gleidson.study;

class Game {
	public void type() {
		System.out.println("Indoor & Outdoor");
	}
}

class Demo {
	Demo() {
		this("I am using this to call a constructor");
	}
	
	Demo(String str) {
		System.out.println(str);
	}
}



public class Cricket extends Game {
	@Override
	public void type() {
		System.out.println("Outdoor Game");
	}
	
	//This class can be called in the main method without instancing.
	public static void square(int x) {
		System.out.printf("Square of %d is = %d ",x, x*x);
	}
	
	
	public static void main(String[] args) {
		Game gm = new Game();
		Cricket ck = new Cricket();
		
		gm.type();
		ck.type();
		
		gm = ck;
		gm.type();
		
		square(10);

	}
}
