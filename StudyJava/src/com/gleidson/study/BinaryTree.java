package com.gleidson.study;

class Node
{
	int key;
	Node right, left;
	
	public Node(int key) {
		this.key = key;
		right = null;
		left = null;
	}
}

public class BinaryTree {
	Node root;
	public BinaryTree() {
		root = null;
	}
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(5);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		
		System.out.printf("Root = %d\nLeft = %d\nRight = %d\n", 
				tree.root.key, tree.root.left.key, tree.root.right.key);
		
	}
}
