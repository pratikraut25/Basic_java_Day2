package com.bzl.day2;
import java.util.*;
public class ReverseIntNumberFor {

	public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a number: ");
      int num = scan.nextInt();

      int reverse=0;
      for(;num != 0;)   
      {  
      int remainder = num % 10;  
      reverse = reverse * 10 + remainder;  
      num=num/10;    
      }
      System.out.println("The revers number of given number is: "+reverse);
  	}
      
	}
	


