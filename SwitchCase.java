package com.logicalstatement;

import java.util.Scanner;

public class SwitchCase {
	
   public static void main(String[] args) {
	   System.out.println("Method main");
	   Scanner sc = new Scanner(System.in);
	  for(int i = 0;i<5;i++) {
		  System.out.println("Enter a jersoy number");
	  
	   int  jersoy = sc.nextInt();
	   
	   switch(jersoy) {
	   case 7 -> System.out.println("Dhoni");
	   case 18 ->System.out.println("virat");
	   case 10 ->System.out.println("sachin");
	   case 1 -> System.out.println("Kl Rahul");
	   case 45 ->System.out.println("Rohit");
	   case 19 ->System.out.println("umesh");
	   case 28 ->System.out.println("Rahul");
	   case 33->System.out.println("Hardik");
	   case 48->System.out.println("Suresh Rani");
	   case 63->System.out.println("SuraykumarYadvu");
	   default ->System.out.println("no vaild ");
	   case 54->System.out.println("comman man ");
	   }
	  
	  } 
	sc.close();
}
}
