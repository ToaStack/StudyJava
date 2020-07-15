package com.gleidson.study;

public class SerializationDemo implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	public int a;
	public String b;
	
	public SerializationDemo(int a, String b) {
		this.a = a;
		this.b = b;
	}
}
