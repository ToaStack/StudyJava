package com.gleidson.study;

import java.util.Scanner;

public class FactorialJava {	
	public Integer factorial(Integer n) {
		
		int factorial = n;
		for(int i = n-1; i > 0; i--) {
			factorial *= i;
		}
		return factorial;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Type a number to calc. the factorial: ");
		int n = in.nextInt();
		FactorialJava factorial = new FactorialJava();
		
		System.out.println(factorial.factorial(n));
		
		in.close();
	}
}
