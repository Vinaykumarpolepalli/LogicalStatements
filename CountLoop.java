package com.logicalstatement;

import java.util.Scanner;

public class CountLoop {

	public static void main(String[] args) {
		int count =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a how even did you want number ");
		int n = sc.nextInt();
		for (int i=0;i<10000;i++) {
			if(i%2==0) {
				System.out.println(i);
				
			count++;
			
			if(count==n) {
				break;
			
			}
			
		}

	}
		sc.close();
	}
}
