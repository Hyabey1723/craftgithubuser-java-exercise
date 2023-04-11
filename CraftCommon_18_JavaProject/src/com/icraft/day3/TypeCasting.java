package com.icraft.day3;

public class TypeCasting {

	public static void main(String[] args) {
		
		int i = 100;
		long l = i; // no explicit type casting required
		float f = l; // no explicit type casting required

		System.out.println("Int value " + i);// 100
		System.out.println("Long value " + l);// 100
		System.out.println("Float value " + f);// 100.0
	}

}
