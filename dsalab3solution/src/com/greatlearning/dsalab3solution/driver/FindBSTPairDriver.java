package com.greatlearning.dsalab3solution.driver;

import java.util.HashSet;

public class FindBSTPairDriver {
	public static class Node {
		int nodeData;
		Node leftNode,rightNode;
	};
	// create newNode
	public Node newNode(int nodeData) {
		Node tempNode = new Node();
		tempNode.nodeData = nodeData;
		tempNode.leftNode=null;
		tempNode.rightNode=null;
		return tempNode;
	}
	// Insert Node Function
	public Node insert(Node root,int keyValue) {
		if(root == null) {
			return newNode(keyValue);
		}
		if(keyValue < root.nodeData) {
			root.leftNode = insert(root.leftNode, keyValue);
		}else {
			root.rightNode = insert(root.rightNode, keyValue);
		}
		return root;
	}
	//finding pair with the sum value gives
	public void findPairWithSum(Node root,int sum) {
		HashSet<Integer> intSet = new HashSet<Integer>();
		if(!findPair(root, sum,intSet)) {
			System.out.println("Pair does not exist with sum value : "+sum);
		}
	}
	//find pair
	public boolean findPair(Node root,int sum,HashSet<Integer> set) {
		if(root==null) {
			return false;
		}
		
		if(findPair(root.leftNode, sum, set)){
			return true;
		}
		
		if(set.contains(sum-root.nodeData)) {
			System.out.println("Sum: "+sum+"\nPair Found : ("+(sum-root.nodeData)+", "+root.nodeData+")");
			return true;
		}else {
			set.add(root.nodeData);
		}
		
		return findPair(root.rightNode, sum, set);
	}
	
}
