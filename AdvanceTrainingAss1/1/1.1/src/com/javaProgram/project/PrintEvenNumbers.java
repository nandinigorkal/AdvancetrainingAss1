package com.javaProgram.project;

import java.util.Scanner;

public class PrintEvenNumbers {

	  public static void main(String args[]) {
      
		  
		  System.out.println("Enter number n to list all even number : ");
		Scanner scan = new Scanner(System.in);
	
		int n = scan.nextInt();
		System.out.print("Even Numbers from 1 to "+n+" are: ");

	
		for (int i = 1; i <= n; i++) {

	   //if number%2 == 0 it means its an even number

	   if (i % 2 == 0) {

		   System.out.print(i + " ");

	   }

	}

	  }

	}


