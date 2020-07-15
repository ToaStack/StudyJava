package com.gleidson.study;

import java.util.ArrayList;
import java.util.List;

class Fruit {
	@Override
	public String toString() {
		return "I'm a fruit!!";
	}
}

class Apple extends Fruit {
	@Override
	public String toString() {
		return "I'm an apple";
	}
}

class AsianApple extends Apple {
	@Override
	public String toString() {
		return "I'm an asian Apple";
	}
}

public class GenericsJava {
	public static void main(String[] args) {
		List<Apple> apples = new ArrayList<>();
		apples.add(new Apple());
		
		List<? extends Fruit> basket = apples;
		for(Fruit fruit : basket) {
			System.out.println(fruit);
		}
	}
}
