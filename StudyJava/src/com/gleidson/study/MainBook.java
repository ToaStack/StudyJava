package com.gleidson.study;

import java.util.Scanner;

public class MainBook {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Type the title: ");
		String title = in.nextLine();
		
		MyBook mybook = new MyBook();
		mybook.setTitle(title);
		System.out.println("The title is: " + mybook.getTitle());
		in.close();
	}
	
}
