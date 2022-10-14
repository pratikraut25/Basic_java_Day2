package com.bzl.day2;
import java.util.*;
public class MaxMin {

	public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter value of b: ");
        int b = sc.nextInt();
        System.out.println("Enter value of c: ");
        int c = sc.nextInt();
        sc.close();
        int w = a+b*c;
        int x = c+a/b;
        int y = a%b+c; 
        int z = a*b+c;
        System.out.println("Value of 1st eqution: "+w);
        System.out.println("Value of 2nd eqution: "+x);
        System.out.println("Value of 3rd eqution: "+y);
        System.out.println("Value of 4th eqution: "+z);
        if(w > x && w > y && w > z){
        	System.out.println("Maximum:"+w);
        }
        	else if(x > w && x > y && x > z){
        		System.out.println("Maximum:"+x);
        		}
        	else if(y > w && y > x && y > z){
        		System.out.println("Maximum:"+y);
        		}
        	else if(z > w && z > y && z > x){
        		System.out.println("Maximum:"+x);
        		}
        if( w < x && w < y && w < z){
    	 	System.out.println("Minimum = " + w);
    		}
        else if( x < w && x < y && x < z){
    	 	System.out.println("Minimum = " + x);
    		}
        else if( y < x && y < w && y < z){
    	 	System.out.println("Minimum = " + y);
    		}  
        else if( z < x && z < y && z < w){
        	 	System.out.println("Minimum = " + z);
        		}
        }
	}


