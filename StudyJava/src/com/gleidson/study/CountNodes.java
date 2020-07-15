package com.gleidson.study;

class Node1
{
	int key;
	Node1 left, right;
	
	Node1(int key) {
		this.key = key;
		left = right = null;
	}
}

public class CountNodes {
	
	Node1 root;
	CountNodes() {
		root = null;
	}
	
	public static void main(String[] args) {
		CountNodes c = new CountNodes();
		
		c.root = new Node1(2);
		c.root.left = new Node1(3);
		c.root.right = new Node1(5);
		
		System.out.println("   " + c.root.key);
		System.out.print(" / ");
		System.out.print(" \\");
		System.out.println();
		System.out.print(c.root.left.key);
		System.out.print("    " + c.root.right.key);
		
	}

}
