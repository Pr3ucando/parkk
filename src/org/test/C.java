package org.test;

import java.util.LinkedList;
import java.util.List;

public class C {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li = new LinkedList<Integer>();
	       li.add(10);
	       li.add(20);
	       li.add(30);
	       li.add(40);
	       li.add(50);
	       List<Integer> li2 = new LinkedList<Integer>();
	       li2.add(20);
	       li2.add(30);
	       li2.add(70);
	       li2.add(80);
	       li2.add(90);
	       
	       
	       // common values print
	       boolean b=li.remove(li2);
	       System.out.println(li);
		
		
		
		
		
		
	}

}
