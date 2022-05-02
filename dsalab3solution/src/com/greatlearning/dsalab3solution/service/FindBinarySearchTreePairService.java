package com.greatlearning.dsalab3solution.service;

import com.greatlearning.dsalab3solution.driver.FindBSTPairDriver;

public class FindBinarySearchTreePairService {

	public static void main(String[] args) {
		FindBSTPairDriver obj=new FindBSTPairDriver();
	
		FindBSTPairDriver.Node root = null;
		
		root = obj.insert(root, 40);
		root = obj.insert(root, 20);
		root = obj.insert(root, 60);
		root = obj.insert(root, 10);
		root = obj.insert(root, 30);
		root = obj.insert(root, 50);
		root = obj.insert(root, 70);
		
		int sum = 100;
		obj.findPairWithSum(root, sum);

	}

}
