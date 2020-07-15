package com.gleidson.study;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class JavaMap {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		Map<String, Integer> map = new HashMap<>();
		map.put("a", Integer.valueOf(10));
		map.put("b", Integer.valueOf(20));
		map.put("c", Integer.valueOf(400));
		
		//Return Set View
		Set<Map.Entry<String, Integer>> st = map.entrySet();
		
		for(Map.Entry<String, Integer> me:st) {
			System.out.print(me.getKey()+ ": ");
			System.out.println(me.getValue());
		}
		
	}
}
