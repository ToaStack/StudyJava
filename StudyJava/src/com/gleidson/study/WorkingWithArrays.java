package com.gleidson.study;

import java.util.Arrays;

public class WorkingWithArrays {
	public static void main(String[] args) {
		
		int[] arr1 = new int[5];
		
		for(int i = 0; i < arr1.length; i++) {
			i+= arr1[i];
		}
		
		System.out.println(Arrays.toString(arr1));
	}
}
