package org.array.arraylist;

import java.util.ArrayList;

public class Converting {
	public void sample() {
		int a[] = new int [5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
	ArrayList<Integer> al = new ArrayList<>();
	for (int i = 0; i < a.length; i++) {
		al.add(a[i]);
	}
	
	System.out.println(al);
	

	}
	public static void main(String[] args) {
		Converting c = new Converting();
		c.sample();
	}

}
