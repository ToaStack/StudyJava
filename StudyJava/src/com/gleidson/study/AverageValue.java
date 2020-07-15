package com.gleidson.study;

import java.util.ArrayList;
import java.util.List;

public class AverageValue {
	public Double average(List<Integer> list) {
		
		return list.stream()
		.mapToInt(i -> i)
		.average()
		.getAsDouble();
	}
	
	public static void main(String[] args) {
		AverageValue av = new AverageValue();
		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(20);
		list.add(20);

		System.out.println(av.average(list));
	}
	
}
