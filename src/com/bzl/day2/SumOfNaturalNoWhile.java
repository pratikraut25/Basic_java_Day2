package com.bzl.day2;
import java.util.*;
public class SumOfNaturalNoWhile {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = scan.nextInt();
    int sum =0;
    int i=1;
    while(i<=n){
    	sum = sum+i;
        i++;
	}
    System.out.println("Sum is: "+sum);


}
}