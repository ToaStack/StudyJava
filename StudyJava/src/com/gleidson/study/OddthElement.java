package com.gleidson.study;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddthElement {
	
	public Integer getElement(List<Integer> list, Integer n) {
		int elementIndex = 2*(n-1);
		return elementIndex > list.size() -1 ? -1 : list.get(elementIndex);
	}
	
	public static void main(String[] args) {
		
		OddthElement odd = new OddthElement();
		
		List<Integer> list = new ArrayList<>();
		list.add(14);
		list.add(20);
		list.add(16);
		list.add(30);
		
		int n = 1;
		
		System.out.println(odd.getElement(list, n));
		
		
	
	}
}
