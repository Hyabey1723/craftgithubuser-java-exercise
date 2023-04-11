package com.icraft.day4;

import java.util.Scanner;

public class EvenNumberChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Write a code that will print even numbers between range, which is start from 1 to user input.
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a positive Integer number: ");
		int value  = in.nextInt();
		
		
		for(int i=1; i<=value; i++) {
			if(i%2==0) {
				System.out.print(i + " ");
			}
		}
		
		
//		String result = (value%2==0)? "you entered Even number" : "you entered not even number";
//		
//		System.out.println("Result: " +result);
		
	}

}
