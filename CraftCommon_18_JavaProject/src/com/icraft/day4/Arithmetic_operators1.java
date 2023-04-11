package com.icraft.day4;

public class Arithmetic_operators1 {
	
	public static void main(String as[]) {
		int a, b, c;
		a = 10;
		b = 2;
		c = a + b; //12
		System.out.println("Addtion: " + c);
		c = a - b;//8
		System.out.println("Substraction: " + c);
		c = a * b;//20
		System.out.println("Multiplication: " + c);
		c = a / b;//5
		System.out.println("Division: " + c);
		b = 3;
		c = a % b;//1
		System.out.println("Remainder: " + c);

		System.out.println("Increment Operator: " + a++);//10   a=11
		System.out.println("Increment Operator: " + ++a);//12   a=12
		System.out.println("decrement Operator: " + a--);//12  a=11
		System.out.println("decrement Operator: " + --a);//10
	}
}
