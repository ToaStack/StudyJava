package com.gleidson.study;

import java.util.Optional;

import javax.swing.JOptionPane;

public class OptionalDemo {
	public static void main(String[] args) {
		Optional<String> checkNull = Optional.ofNullable(name());
		if(checkNull.isPresent()) {
			JOptionPane.showMessageDialog(null, name(), "Success", JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null, "Name is null", "Error", JOptionPane.ERROR_MESSAGE);
		}	
	}
	
	private static String name() {
		String name = "Gleidson Guilhem";
		return (name.length() > 10) ? name : null;
	}
}
