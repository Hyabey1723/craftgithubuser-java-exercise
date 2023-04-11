package com.icraft.day4;

import java.util.Scanner;

public class Conditional_operators2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter any number: ");
		int number =  in.nextInt();
		
		String result = (number>0)? "You entered postive number" : "You entered negative number" ;
		
		System.out.println(result);
		
		if(number >  0) {
			System.out.println("You entered postive number");
		}
		else {
			System.out.println("You entered negative number");
		}
		
	}

}
