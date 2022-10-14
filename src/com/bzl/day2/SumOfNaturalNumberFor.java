package com.bzl.day2;
import java.util.*;
public class SumOfNaturalNumberFor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number: ");
      int n = scan.nextInt();
      int sum = 0;
      for(int i=1; i<=n; i++){
    	  sum = sum +i;
      }
    
      System.out.println("Sum of given number: "+sum);

	}

}
