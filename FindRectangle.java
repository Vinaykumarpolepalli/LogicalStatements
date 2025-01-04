package com.logicalstatement;

import java.util.Scanner;

public class FindRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a length of rectangle");
		Double length = sc.nextDouble();
		
		System.out.println("Enter a width of rectangle");
		Double width = sc.nextDouble();
		
		
		Double area  = (length*width);
		Double perimeter = 2*(length+ width);
		
		System.out.println("Area of rectangle is :"+area);
		System.out.println("Perimeter of rectangle is :"+perimeter);
		
		
		
		
		

	}

}
