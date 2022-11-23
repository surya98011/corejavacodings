package com.semanticsquare.basics;

import java.util.Scanner;

//java.util.*;
public class Practice1 {

	public static void printWeekOfTheDay() {
		boolean value = true;
		while (value=true) {
		Scanner scn = new Scanner(System.in);
		System.out.println("inter the number of the day");
		int day = scn.nextInt();
		if (day>7) {
			System.out.println(" sorry invalid number ");
		}
		else {
		switch(day) {
		case 1:
			System.out.println("sunday");
			break;
		case 2:
			System.out.println("monday");
			break;
		case 3:
			System.out.println("tuesday");
			break;
		case 4:
			System.out.println("wednesday");
			break;
		case 5:
			System.out.println("thrusday");
			break;
		case 6:
			System.out.println("friday");
			break;
		case 7:
			System.out.println("saturday");
			break;
		default:
			System.out.println("there is no such day defined");
			break;
		}
		}
		}
		
	}
	
	
	public static void main(String[] args) {
      
//		int i =1;
//		if(i==1) {
//			System.out.println("input is one");
//		}
//		else if(i==2) {
//			System.out.println("input was two");
//		}
//		else {
//			System.out.println("sorry we coud not find any input ");
//		}
//		
//		int _Switchint = 4;
//		
//		switch(_Switchint) {
//		
//		case 1:
//			System.out.println("value was one");
//		 break;
//		 
//		case 2:
//			System.out.println("value was 2");
//			System.out.println("Surya kant pandey ");
//			break;
//			
//		default:
//			System.out.println("was not found any input");
//			break;
//			
//		}
//		
//		char Value = 'E';
//				
//				switch(Value) {
//				
//				case 'A':
//					System.out.println("A is found");
//					break;
//					
//				case 'B' :
//					System.out.println("B is found");
//					break;
//					
//				case 'C':
//					System.out.println("C is found");
//					break;
//				case 'D': case 'E':  case 'F':
//					System.out.println(Value+" is found");
//					break;
//					
//				default:
//					System.out.println("no inut is found");
//					break;
//				
//				}
				
//				String month = "JUNE";
//				switch(month.toLowerCase()) {
//				case "january" :
//					System.out.println("found 1st month");
//					break;
//					
//				case "february":
//					System.out.println("found second month");
//					break;
//				case "march":
//					System.out.println("march found");
//					break;
//				case "april": case "may": case "june":
//					System.out.println(month+"found");
//				}
//				
		printWeekOfTheDay();
				
	}

}
