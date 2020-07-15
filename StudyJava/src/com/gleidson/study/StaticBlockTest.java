package com.gleidson.study;

class StEmployee
{
	int eid;
	String name;
	static String company_name;
	
	static {
		company_name = "Studyatnight";
	}
	
	public void show() {
		System.out.printf("%d, %s, %s", eid, name, company_name);
	}
}

public class StaticBlockTest {
	public static void main(String[] args) {
		StEmployee se1 = new StEmployee();
		se1.eid= 104;
		se1.name="Gleidson";
		se1.show();
	}
}
