package com.semanticsquare.basics;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPrime(55)); 
		//printAllPrime();
   /* Scanner scn = new Scanner(System.in);
    int limit = scn.nextInt();
    // first algo for prime 
    for(int i=0;i<=limit;i++) {
    	
    	int n = scn.nextInt();
    	int count=0;
    	for(int div=1;div<=n;div++) {
    		if(n%div==0) {
    			count++;
    		}
    	}
    	if(count==2) {
    		System.out.println("prime");
    	}
    	else {
    		System.out.println("not prime");
    	}
    	
    }
    
    
    // second optimized algo for prime
	int t = scn.nextInt();
		       for(int i=0;i<=limit;i++) {
		    	
		    	int n = scn.nextInt();
		    	int count=0;
		    	for(int div=2;div*div<=n;div++) {
		    		if(n%div==0) {
		    			count++;
		    			break;
		    		}
		    	}
		    	if(count==2) {
		    		System.out.println("prime");
		    	}
		    	else {
		    		System.out.println("not prime");
		    	}
		    	
		       }
		int count = 0;
		int div=2;
		for(int i=5;i*i<=100;i++,div++) {
		if(i%div ==0) {
			count++;
			break;
		}
		if(count==0) {
			System.out.println(i);
		}
		
		}*/
	}
	
	public static void printAllPrime() {
		Scanner scn = new Scanner(System.in);
		int low = scn.nextInt();
		int high = scn.nextInt();
	
		for(int i = low;i<=high;i++) {
		 int count  =0;
		 for(int div =2;div*div<=i;div++) {
			 
			 if(i%div == 0) {
			 count++;
			 break;
			 }
		 }
		 if(count==0) {
		 System.out.println(i);
		 }
		}
	}
	public static boolean isPrime(int n) {
	   if(n<=1) {
		   return false;
	   }
	   if(n<=3) {
		   return true;
	   }
	   if(n%2==0 || n%3==0) {
		   return false;
	   }
	  
	   for(int i=5;i*i<=n;i=i+6) { 
		   if(n%i==0 || n%(i+2)==0) 
			   return false;
		   
		   
	   
	   }
		return true;
		}
	}


