package org.test;

public class Array1 {
	
	public static void main(String[] args) {
		int a[] = new int[5];
		a[1] = 6;
		a[3] = 19;
		a[0] = 8;
		a[2] = 7;
		a[4] = 5;
		System.out.println(a[2]);
		int le = a.length;
		System.out.println("length is  " +le);
		System.out.println("iterate using normal for loop");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
	

}
