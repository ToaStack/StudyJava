package com.gleidson.study;

import java.util.Scanner;

public class ReverseArrayJava {
	public String reverse(String s) {
		
		String reverse = "";
		char[] r = s.toCharArray();
		int size = r.length-1;
		int x=size;
		for(int count : r) {
			reverse += r[x];
			x--;
		}
		return reverse;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Type a word and I will rever it: ");
		String s = in.nextLine();
		
		ReverseArrayJava r = new ReverseArrayJava();
		System.out.println(r.reverse(s));
		
		in.close();
	}
}
