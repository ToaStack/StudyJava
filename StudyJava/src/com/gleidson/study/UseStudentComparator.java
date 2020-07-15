package com.gleidson.study;

import java.util.*;

public class UseStudentComparator {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("How many students do you want to add? ");
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> students = new ArrayList<>();
		
		while(testCases > 0) {
			System.out.print("Type an ID: ");
			int id = in.nextInt();
			System.out.print("Type the First Name: ");
			String fname = in.next();
			System.out.print("Type an CGPA: ");
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			students.add(st);
			
			testCases--;
		}
		
		Collections.sort(students, Comparator.comparing(Student::getCgpa).reversed()
				.thenComparing(Student::getFname)
				.thenComparing(Student::getId));
		
		System.out.println();
		
		for(Student st : students) {
			System.out.println(st.getFname());
		}
	}
}
