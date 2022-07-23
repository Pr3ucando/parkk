package org.test;

public class Map {
	
	public static void main(String[] args) {
		String s = "Preeti123456%^";
		int upper = 0, lower = 0, special = 0, number = 0;
		for(int i=0;i<s.length();i++) {
			char c= s.charAt(i);
			if(Character.isUpperCase(c)) {
				upper++;
				
			}
			else if(Character.isLowerCase(c)) {
				lower++;
				
			}
			else if(Character.isDigit(c)) {
				number++;
				
			}
			else special++;
			
		}
			
		System.out.println("UpperCase "+upper);
		System.out.println("LowerCase "+lower);
		System.out.println("Number "+number);
		System.out.println("Special "+special);
	}
}
