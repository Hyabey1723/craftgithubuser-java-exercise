package com.icraft.day4;

public class Logical_operators1 {

	public static void main(String as[]) {
		
		boolean a = true;
		boolean b = false;

		System.out.println("a && b = " + (a && b));//false
		System.out.println("a || b = " + (a || b)); //true
		System.out.println("!(a && b) = " + !(a && b)); //true
	}
}
