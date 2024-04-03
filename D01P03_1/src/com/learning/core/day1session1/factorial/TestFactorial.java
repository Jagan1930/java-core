package com.learning.core.day1session1.factorial;

import java.util.Scanner;

public class TestFactorial {
	public static void main(String args[]){  
		  int i,fact=1;  
		  int number=5;//It is the number to calculate factorial   
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter Number: ");
		  number = sc.nextInt();
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);
		 }

}
