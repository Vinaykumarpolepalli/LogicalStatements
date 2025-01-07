package com.logicalstatement;

import java.util.Scanner;

public class CaseStudy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Your Marks ");
		int marks = sc.nextInt();
		
		if(marks >50 ) {
			System.out.println("Congratulations! You are the Eligable for the next Exam man");
		}
		else {
			System.out.println("Sorry, you are not eligable for the next Exam");
		}
 sc.close();
	}

}
