package org.test;

import java.util.stream.IntStream;

public class QuesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
			int sum = IntStream.of(a).sum();
			System.out.println("The sum is  :"+ sum);

		
		
	}

}
    