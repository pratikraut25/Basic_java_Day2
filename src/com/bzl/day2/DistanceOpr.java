package com.bzl.day2;
import java.util.*;
public class DistanceOpr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the value of x");
		int x = sc.nextInt();
		
	 	System.out.println("Enter the value of y");
		int y = sc.nextInt();
		
		sc.close(); 

		double distance = Math.pow(( x*x + y*y ), 0.5);
		
		System.out.println("Euclidean distance = " +distance);
	}

}
