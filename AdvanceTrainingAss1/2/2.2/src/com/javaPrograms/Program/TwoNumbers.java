package com.javaPrograms.Program;

import java.util.Scanner;

public class TwoNumbers {
  public static void main(String[] args) {

	  
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("enter first number : ");
	 int firstnum=sc.nextInt();
	 System.out.println("enter second number : ");
	 int secondnum=sc.nextInt();
    int i = 1, n = 13;
    System.out.println("Fibonacci Series till " + n + " terms:");

    while (i <= n) {
      System.out.print(firstnum + ", ");

      int nextTerm = firstnum + secondnum;
      firstnum = secondnum;
      secondnum = nextTerm;

      i++;
    }
  }
}