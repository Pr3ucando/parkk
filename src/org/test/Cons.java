package org.test;

import java.lang.reflect.Constructor;

public class Cons {
	int id;
	short phoneno;
	

	Cons(int i , short ph)
	{
	id = i;
	ph = phoneno;
	}
	void display() {
		System.out.println(id + " " + phoneno);
	}
	public static void main(String[] args) {
		Cons c =new Cons(23, (short) 32343);
		Cons c1 = new Cons(24, (short) 31445);
		
		c1.display();
		c.display();
		
	}
	
}
