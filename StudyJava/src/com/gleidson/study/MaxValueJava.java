package com.gleidson.study;

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MaxValueJava {
	public Integer maximum(Integer[] list) {
		Arrays.sort(list);
		int max = list[list.length-1];
		return max;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("How many elements you would like to add in the array: ");
		int n = in.nextInt();
		Integer[] arr = new Integer[n];
		
 		for(int i = 0; i < n; i++) {
 			System.out.printf("Arr[%d]: ", i);
 			arr[i] = in.nextInt();
 		}
		
 		MaxValueJava m = new MaxValueJava();
 		System.out.printf("The maximum value of yout array is: %d",m.maximum(arr));
		
 		in.close();
	}
}
