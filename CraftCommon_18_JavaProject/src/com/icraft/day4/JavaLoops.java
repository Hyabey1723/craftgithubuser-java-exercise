package com.icraft.day4;

public class JavaLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Write a code that will print 1 to 100;
		// we loop

		// while
		System.out.println("While LOOP:");

		// initialize
		int i = 101;
		while (i <= 100) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();

		// DO-while
		System.out.println("DO While LOOP:");

		// initialize
		int k = 101;
		do {
			System.out.print(k + " ");
			k++;
		} while (k <= 100);

		System.out.println();

		// For-loop
		System.out.println("FOR LOOP:");
		for(int j=101; j<=100; j++) {
			System.out.print(j + " ");
		}

	}

}
