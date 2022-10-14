package com.bzl.day2;
import java.util.*;
public class PalindromeNumberFor {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
	      System.out.println("Enter a number: ");
	      int num = scan.nextInt();
          int c= num;
	      int reverse=0;
	      for( ;num != 0; )   
	      {  
	      int remainder = num % 10;  
	      reverse = reverse * 10 + remainder;  
	      num=num/10;    
	      }
	      if ( c == reverse ) {
				 System.out.println("Palindrome Number");
			}
			 else { 
				 System.out.println("Not a palindrome number");
			 }
	}

}
