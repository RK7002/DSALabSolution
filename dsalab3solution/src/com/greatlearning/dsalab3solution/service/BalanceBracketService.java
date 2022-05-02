package com.greatlearning.dsalab3solution.service;

import java.util.Scanner;
import com.greatlearning.dsalab3solution.driver.BalanceBracketDriver;

public class BalanceBracketService {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter The String To Check The Balanced Brackets: ");
		String inputString = scanner.next();
				
		//Calling checkBalanceBracket
		if(new BalanceBracketDriver().checkBalanceBracket(inputString)) {
			System.out.println("The Entered String i.e. "+inputString+" has Balanced Brackets.");
		}else {
			System.out.println("The Entered String i.e. "+inputString+" does not contain Balanced Brackets.");
		}
		
		scanner.close();
	}
}
