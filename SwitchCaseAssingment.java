package com.logicalstatement;

import java.util.Scanner;

public class SwitchCaseAssingment {

	public static void main(String[] args) {
		System.out.println("main method is started");
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number between 1  to 7");
		int day=sc.nextInt();
		
		switch(day) {
		case 1 -> System.out.println("monday");
		case 2 -> System.err.println("tuesaday");
		case 3 -> System.out.println("Wednesday");
		case 4-> System.out.println("thursday");
		case 5 -> System.out.println("Friday");
		case 6 ->System.out.println("Saturday");
		case 7 ->System.out.println("Sunday");
		default ->System.out.println("not a vaild number");
		}
		sc.close();
	}

}
