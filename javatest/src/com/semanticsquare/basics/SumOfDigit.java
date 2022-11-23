package com.semanticsquare.basics;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		printLevelOfStudent();
//		System.out.println("*****");
//		System.out.println("   *");
//		System.out.println("  *");
//		System.out.println(" *");
//		System.out.println("*");
//		System.out.println("*****");


//  System.out.println("the sum of the digit is "+sumOfDigit(145));
//  System.out.println("the sum of the digit is "+sumOfDigit(123456789));
//  System.out.println("the sum of the digit is "+sumOfDigit(123456));
//  System.out.println("the sum of the digit is "+sumOfDigit(145));

	}
	public static int sumOfDigit(int n) {
		
		if(n<10) {
			return -1;
		}
		int sum=0;
		while(n>0) {
			int digit = n%10;
			sum +=digit;
			n /=10;
			
		}
		return sum;
			
	}
	
	public static void  printStarInOneLine() {
		System.out.println("*\n**\n***\n****\n*****\n");
	}
	public static void printLevelOfStudent() {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("enter the marks");
		int marks = scn.nextInt();
		
		if(marks>90&&marks<=100) {
			System.out.println("Excellent");
			
		}
		else if (marks>80&&marks<=90) {
			System.out.println("good");
		}
		else if (marks>70&&marks<=80) {
			System.out.println("fair");
		}
		else if (marks>60&&marks<=70) {
			System.out.println("meet expectations");
		}
		else {
			//scn.nextLine();
		System.out.println("below parameter");
		scn.close();
		return;
		}
		
	}

}
