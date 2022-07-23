package org.test;

import java.util.LinkedList;
import java.util.List;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> li = new LinkedList<Integer>();
	       li.add(10);
	       li.add(20);
	       li.add(30);
	       li.add(90);
	       li.add(40);
	       li.add(50);
	       li.add(90);
	       li.add(20);
	       li.add(30);
	       li.add(90);
	       li.add(70);
	       li.add(80);
	       
	       li.remove(3);
	       System.out.println(li);
	       li.add(5, 60);
	       System.out.println(li);
	       li.set(5, 100);
	       System.out.println(li);
	       int l= li.lastIndexOf(90);
	       System.out.println(l);
	       boolean s =li.contains(110);
	       System.out.println(s);
	       Integer p = li.get(8);
	       System.out.println(p);
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	}

}
