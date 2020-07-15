package com.gleidson.study;

class NodeTest {
	int value;
	NodeTest left, right;
	
	public NodeTest(int value) {
		this.value = value;
		left = right = null;
	}
}

public class Experiments {	
	
	public void insert(NodeTest node, int value) {
		//If the new node’s value is lower than the current node’s, go to the left child
		if(value < node.value) {
			if(node.left != null) {
				insert(node.left, value);
			}else {
				System.out.printf("Inserted %d value to the left of %d\n", value, node.value);
				node.left = new NodeTest(value);
			}
		//If the new node’s value is greater than the current node’s, go to the right child
		}else if(value > node.value) {
			if(node.right != null) {
				insert(node.right, value);
			//When the current node is null, we’ve reached a leaf node, we insert the new node in that position
			}else {
				System.out.printf("Inserted %d value to the right of %d\n", value, node.value);
				node.right = new NodeTest(value);
			}
		}
	}
	
	public void traverseInOrder(NodeTest node) {
		if(node != null) {
			traverseInOrder(node.left);
			System.out.println(" " + node.value);
			traverseInOrder(node.right);
		}
	}
	
	public static void main(String[] args) {
		Experiments tree = new Experiments();
		NodeTest root = new NodeTest(5);
		System.out.println("Binary Tree Example");
		System.out.println("Building Tree with root value: " + root.value);
		
		tree.insert(root, 2);
		tree.insert(root, 4);
		tree.insert(root, 8);
		tree.insert(root, 6);
		tree.insert(root, 7);
		tree.insert(root, 3);
		tree.insert(root, 9);
		
		System.out.println	("Traversing tree in order");
		tree.traverseInOrder(root);
		
	}
}
