package com.bridgelabz;

import java.util.Scanner;

public class VarMethodBlocks {


	// creating static method
	
	static int factorial(int num) {
		int factorial=1;
		
		for(int k = 1 ; k <= num ; k++)
		  {
				 	factorial = factorial * k;
		  }
		
		return factorial;
	}
		  
		  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		
		int fact = factorial(num);
		System.out.println("Factorial is : "+fact);
		
		scan.close();
	}

}
