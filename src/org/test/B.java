package org.test;

import java.util.LinkedList;
import java.util.List;

public class B {

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
       li.removeAll(li2);
       
       //uncommon or duplicate values
       System.out.println(li);
       int s = li.size();
       System.out.println(s);
       
       
		}

}
