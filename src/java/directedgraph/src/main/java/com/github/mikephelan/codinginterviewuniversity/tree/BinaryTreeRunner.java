package com.github.mikephelan.codinginterviewuniversity.tree;

public class BinaryTreeRunner {
    private static BinaryTree CreateBinaryTree() {
	BinaryTree bt = new BinaryTree();
	bt.add(6);
	bt.add(4);
	bt.add(8);
	bt.add(3);
	bt.add(5);
	bt.add(7);
	bt.add(9);

	return bt;
    }

    public static void main(String[] args) {
	System.out.println("Hello, Binary Search Tree!");
	BinaryTree bt = BinaryTreeRunner.CreateBinaryTree();
	System.out.println("Binary Tree contains six: " + bt.containsNode(6));
	if(bt.containsNode(9)) {
	    bt.delete(9);
	}
	System.out.println("Binary Tree contains nine after deletion: " + bt.containsNode(9));
    }
}
