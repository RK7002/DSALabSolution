package com.greatlearning.dsalab3solution.driver;

import java.util.Stack;

public class BalanceBracketDriver {

	public boolean checkBalanceBracket(String inputString) {
		Stack<Character> charStack = new Stack<Character>();
		
		for(int i=0;i<inputString.length();i++) {
			
			char ch = inputString.charAt(i);
			
			if(ch == '(' || ch == '{' || ch == '[') {
				charStack.push(ch);
				continue;
			}
			
			if(charStack.isEmpty()) { 
				return false;
			}
			
			char tempChar;
			
			switch (ch) {
				case')': 
					tempChar = charStack.pop();
					if(tempChar == '[' || tempChar == '{') {
						return false;
					}
					break;
				case '}':
					tempChar = charStack.pop();
					if(tempChar == '[' || tempChar == '(') {
						return false;
					}
					break;
				case ']':
					tempChar = charStack.pop();
					if(tempChar == '{' || tempChar == '(') {
						return false;
					}
					break;
				default:
					break;
			}
		}
		return charStack.isEmpty();
	}
}
