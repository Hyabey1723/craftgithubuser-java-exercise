package com.icraft.day4;

public class Assignment_operators1 {

	public static void main(String as[]) {

		int a = 30;
		int b = 10;
		int c = 0;
		c = a + b;// 40
		System.out.println("c = a + b = " + c);
		c += a; // c=c+a 70
		System.out.println("c += a  = " + c);
		c -= a; // c=c-a 40
		System.out.println("c -= a = " + c);
		c *= a; // c=c*a 1200
		System.out.println("c *= a = " + c);
		a = 20;
		c = 25;
		c %= a; // c= c%a 5
		System.out.println("c %= a  = " + c);

	}
}
