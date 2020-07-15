package com.gleidson.study;

import java.util.List;
import java.util.ArrayList;

public class FunctionalInterface {
	public static void main(String[] args) {
		
		new Thread(new Runnable() {
			public void run() {
				System.out.println("New Thread Created");
			}
		}).start();
		
		new Thread(() -> {System.out.println("Second Thread Created");}).start();
		
		// A little of lambda expression
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(8);
		
		list.forEach(n->{System.out.println(n);});
	}
}
