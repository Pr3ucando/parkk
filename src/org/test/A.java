package org.test;

import java.util.ArrayList;

import java.util.List;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li = new ArrayList<Integer>();	
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		System.out.println(li);
		int size = li.size();
		System.out.println(size);
		int index = li.indexOf(30);
		System.out.println(index);
		int ind = li.get(1);
		System.out.println(ind);
		
		
		
		
	}

}
