package com.bzl.day2;
import java.util.*;
public class ReverseIntNumberWhile{

	public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number");
		int number = scan.nextInt();
		int originalno = number;
		int i = 0;
		int reverseno  = 0;
		int remainder = 0;
		while(number!=0)
		{
			remainder = number % 10;
	    	System.out.println("remainder: "+remainder);
	    	reverseno = reverseno * 10 + remainder;
	    	number = number / 10;
	    	

		}
		 System.out.println("Reverse of number " + originalno + " is " +reverseno);
    
	}

}
