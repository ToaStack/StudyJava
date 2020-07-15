package com.gleidson.study;

class Animal {
	Animal getObj() {
		System.out.println("Animal Object");
		return new Animal();
	}
}

class Dog extends Animal {
	Dog getObj() {
		System.out.println("Dog Object");
		return new Dog();
	}
}

public class MethodOverrideTest {
	public static void main(String[] args) {
		
		new Dog().getObj();
		
	}
}
