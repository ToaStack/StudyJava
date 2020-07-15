package com.gleidson.study;

class Parent { } 

public class InstanceOfTest extends Parent
{
	public void check()
	{
		System.out.println("Successful Casting");
	}
	
	public static void show(Parent p)
	{
		if(p instanceof InstanceOfTest) {
			InstanceOfTest b1 = (InstanceOfTest)p;
			b1.check();
		}
	}
	
	public static void main(String[] args) {
		Parent p = new InstanceOfTest();
		InstanceOfTest.show(p);
	}
	
}