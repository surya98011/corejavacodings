package Javaoops;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int count = 0;
		int sum = 0;
		
		
		while(true) {
		int order = count+1;
			System.out.println("please enter the number #"+order+" :");
	      boolean isAnInt = sc.hasNextInt();
	      if(isAnInt) {
			int input = sc.nextInt();
			count++;
			sum +=input; 
			if(count==10) {
				
				break;				
				
			}
			
	      }
			else {
			
				System.out.println("Invalid number plz try again :");
                 
				
			}
			sc.nextLine();//handle end of line(enter key)
		    // to avoid and clear the invalid inut from scanner inputs
		}
	      System.out.println("sum : "+sum);
	      sc.close();
		
	}
		//System.out.println("hello")
		// TODO Auto-generated method stub
//Scanner scn = new Scanner(System.in);
//System.out.println("please enter the birth of year");
//    boolean hasnextInt = scn.hasNextInt();
//    if(hasnextInt) {
//		int birthYear = scn.nextInt();
//		scn.nextLine();
//		System.out.println("please enter the name ");
//		String name = scn.nextLine();
//		int age = 2021-birthYear;
//		if(age>0&&age<=100) {
//		System.out.println("Hi "+name+" You are "+age+" years old");
//		}
//		else {
//			System.out.println("invalid year of birth");
//		}
//    }
//    else {
//    	System.out.println("unable to get the year of birth");
//    }
   // scn.close();
	
   
	}
	
