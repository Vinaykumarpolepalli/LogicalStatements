package com.logicalstatement;

import java.util.Scanner;

public class FindEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//Write a java program to find given integer is even or odd
		System.out.println("Enter number");
	    int a = sc.nextInt();
	 if(a %2==0 ) {
		 
		 System.out.println("Given number is even number");
		 
	 }else {
		 System.out.println("odd number");
	 }

	 
	 
//Write a java program to find given integer is even or odd without if else	 
	     String  s = (a%2 == 0) ? "evev " : "odd";
		 System.out.println("numberis : "+ s);

//Write a java program to find given integer is even or odd without using modular
		System.out.println("enter number:");
		int number = sc.nextInt();
		if((number & 2)==0) {
		 System.out.println("is even ");
		 }else {
			 System.out.println("in odd");
		 }
		sc.close();
		}

}

 

