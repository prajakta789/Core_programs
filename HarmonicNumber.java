package com.basic_core_programe;
import java.util.*;


public class HarmonicNumber {

		float harmonic = 1;
		
	    public static void main(String[] args) { 
	    	
	    	System.out.println("Enter an number to print harmonic: ");
	       
	    	Scanner sc=new Scanner(System.in);
	        int n = sc.nextInt();
	        
	        // compute 1/1 + 1/2 + 1/3 + ... + 1/n
	        double sum = 0.0;
	        for (int i = 1; i <= n; i++) {
	        	System.out.println("harmonic is : " + i + "/" + n );
	            sum += 1.0 / i;
	        }

	        // print the nth harmonic number
	        System.out.println(sum);
	    }

	}



