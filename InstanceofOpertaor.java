package com.logicalstatement;

public class InstanceofOpertaor {

	public static void main(String[] args) {
		String s = new String("Java");
		String s0 = "vinay";
		System.out.println(s);
		System.out.println(s instanceof String);
		System.out.println(s instanceof Object);
				
			
		System.out.println("****************************");
		System.out.println(s0);
		System.out.println(s0 instanceof String);
		System.out.println(s0 instanceof Object);
	
		String s1 =null;
		System.out.println(s1 instanceof Object);

		Double d = 100.20;
		Integer i = 1000;
		System.out.println(i);
		System.out.println(i instanceof Object);
		System.out.println(d);
		System.out.println(d instanceof Object);
   
		InstanceofOpertaor i1 = new InstanceofOpertaor();
		System.out.println(i1);
		System.out.println(i1 instanceof Object);
		System.out.println(i1 instanceof InstanceofOpertaor );;
	
	}
	

}
