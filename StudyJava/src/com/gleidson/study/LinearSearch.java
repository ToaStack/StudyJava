package com.gleidson.study;

public class LinearSearch {
	int index=0;
	public int search(Integer n, Integer[] arr) {
		for(int i =0; i < arr.length; i++) {
			if(arr[i].equals(n)) {
				index = i;
				break;
			}else {
				index = -1;	
			}
		}
		return index;
	}
	
	public static void main(String[] args) {
		LinearSearch ls = new LinearSearch();
		
		Integer[] list = {1,2,23,4,5,8,7,51};
		Integer n = 51;
		System.out.println(ls.search(n, list));
			
	}
}
