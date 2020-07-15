package com.gleidson.study;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerializableDemo {
	public static void main(String[] args) {
		SerializationDemo object = new SerializationDemo(1, "GeeksForGeeks");
		String filename = "file.ser";
		
		//serialization
		try {
			//Save of objet in files
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			//Method for serialization of object
			out.writeObject(object);
			
			out.close();
			file.close();
			
			System.out.println("Object has been serialized");
			
		} catch(IOException ex) {
			System.out.println("IOException is caught");
		}
		
		//SerializationDemo object1 = null;
		
		//Deserialization
		try {
			//Reading the object from the file
			FileInputStream file = new  FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			//Method for deserialization
			object = (SerializationDemo)in.readObject();
			
			in.close();
			file.close();
			
			System.out.println("Object has been deserialized");
			System.out.println("a = " + object.a);
			System.out.println("b = " + object.b);
		}catch(IOException ex) {
			System.out.println("IOException is caught");
		}
		catch(ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException is caught");
		}
		
	}
}
