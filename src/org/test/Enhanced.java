package org.test;

public class Enhanced {
	
	public static void main(String[] args) {
		
		int a[]= new int[5];
		a[1] = 6;
		a[2] = 19;
		a[3] = 8;
		a[0] = 7;
		a[4] = 3;
		System.out.println("iterate using enhanced for loop");
		for(int x:a) {
			System.out.println(x);
		}	
		
	}	

}
