package org.test;

import java.util.ArrayList;
import java.util.List;

public class Samplelist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List li = new ArrayList();
		li.add(10);
		li.add("Preethi");
		li.add(04647.36338f);
		li.add(true);
		li.add('P');
		System.out.println(li);
		Object object = li.get(1);
		System.out.println(object);	
	}

}
