package org.array.practice;

public class Practice {
public void sample() {
int a[] = new int [5];
a[0] = 10;
a[1] = 20;
a[2] = 30;
a[3] = 40;
a[4] = 50;

System.out.println(a[2]);

for (int i = 0; i < a.length; i++) {
	System.out.println(a[i]);
}

for (int i : a) {
	System.out.println(i);
}
}

public static void main(String[] args) {
	Practice p = new Practice();
	p.sample();
}
}
