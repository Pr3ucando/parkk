package org.test;

import java.util.ArrayList;
import java.util.List;

public class E {

	public static void main(String[] args) {

		List<Integer> li = new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		li.add(10);
		int s=li.size();
		System.out.println(s);
		int d=li.indexOf(50);
		System.out.println(d);
		int e=li.lastIndexOf(10);
		System.out.println(e);
		int ee=li.remove(2);
		System.out.println(ee);
	
		
		}
	}


