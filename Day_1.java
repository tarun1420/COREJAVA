package core;

import java.util.Scanner;

public class Day_1 {
	public static void  main(String[] args) {
        int x = 0; 
		int y =0;
		int ans;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		x = sc.nextInt();
		y = sc.nextInt();
	    
		 System.out.println("\nEnter the option(1.+,2.-,3.*,4./):");
		 int operator = sc.nextInt();		 
switch(operator) {
case 1: ans = x+y;
System.out.println("x + y ="+ans);
break;
case 2: ans = x-y;
System.out.println("x - y ="+ans);
break;
case 3: ans = x*y;
System.out.println("x * y ="+ans);
break;
case 4: ans = x/y;
System.out.println("x / y ="+ans);
break;
	default:
		System.out.println("Error!Select a valid operator");
	
}
}
}
