package com.icraft.day2;

public class LocalVariableDemo {
	
	public void methodone() { //concret method
		int j = 25; // <---------- local variable
		System.out.println("Value of j:" + j); // 25
	}

	public void methodtwo() {
		int k = 30; // <---------- local variable
		System.out.println("Value of k:" + k); // 30
//		System.out.println("Value of j:" + j); // ← Error
	}

	public static void main(String[] args) { // main method
		// TODO Auto-generated method stub
		LocalVariableDemo var = new LocalVariableDemo(); //object creation
		
		//method call
		var.methodone();
		var.methodtwo();
	}
}
