package com.logicalstatement;

import java.util.Scanner;

public class TopOdd {

	public static void main(String[] args) {
		System.out.println("main method is started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your  number");
		int a = sc.nextInt();
		
		
				if(a %2!=0) {
				System.out.println("odd number");
				}else {
					System.out.println("even");
					sc.close();	
			}
				//Terary operators
				System.out.println("Enter a number ");
				long l =sc.nextLong();
				String res=(l%2==0)? "Even":"odd";
				System.out.println(res);
				
				//repeating statements 100 times
				int i;
				for(i=0;i<=100;i++) {
					System.out.println(i+".Good Morning sir");
					
				}
				// 0-10 even numbers
				int b;
				for(b=0;b<=10;b++) {
				if(b%2==0) {
					System.out.println(b);
					
				}
				}
				 //0-10 odd numbers 
				int c ;
				for(c=0;c<=10;c++) {
					if(c%2!=0) {
						System.out.println(c);
					}
				}
			    //Reversal 10-0 odd numbers
				int d ;
				for(d=10;d>=0;d--) {
					if(d%2!=0) {
						System.out.println(d);
					}
				}	
				
				//reversal 10-0 even numbers
				int e ;
				for(e=10;e>=0;e--) {
					if(e%2==0) {
						System.out.println(e);
					}
			
				}	
		
				//Reversal 10 -0
				int f ;
				for(f=10;f>=0;f--) {
					
						System.out.println(f);
					
				}	
				
				
		}
}
