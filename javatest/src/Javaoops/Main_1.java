package Javaoops;

import java.util.Scanner;

public class Main_1 {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
		//int count =0;
		System.out.println("hello java");
		while(true) {
		Scanner scn = new Scanner(System.in);
	String amount = scn.next() ;
		haalChal(amount);
		
		}
//		//int number =1;
//		int finish_number=20;
//		int even_number_found=0;
//		while(number<=finish_number) {
//			number++;
//			if(!isEven(number)) {
//
//				continue;
//			}
//			System.out.println("The even number is "+number);
//			even_number_found++;
//			if(even_number_found>=6) {
//				break;
//			}
			
				//	}
		//System.out.println("the total  even number found "+even_number_found);
		//System.out.println(sumOdd(5,15));
//		int range = 50;
//	System.out.println(sumOfOdd(range));	
//				int count = 0;
//		for(int i =10;i<100;i++) {
//			if(isPrime(i)) {
//				count++;
//			System.out.println("Number : "+i+" is a prime number ");
//
//			}
//			if(count==15) {
//				System.out.println("exiting from the loop");
//				break;
//			}
//		}
//		
//System.out.println("hello java");
//		boolean xyz = true;
//		while(xyz=true) {
//Scanner scn = new Scanner(System.in);
//int amount = scn.nextInt() ;
//		
//System.out.println(isPrime(amount));
//		}
//int rate = scn.nextInt();
	 // for(double i = 2;i<=10;i++) {
 //System.out.println("The total rate of interest is "+ calculateInterest (amount,i));
	
	 // }
		
		
	}
	
	public static double calculateInterest(double amount , double rate ) {
		
		return (amount*(rate/100));
	}
	// to check the prime number 
	public static boolean isPrime(int n) {
		if(n==1) {
			return false;
		}
		for(int i=2;i<=(long)Math.sqrt(n);i++) {//here limit n/2 is having more number of iteration
			System.out.println("looping"+i);
			if(n%i==0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static int sumOfOdd(int range) {
		int sum=0;
		for(int i = 1; i<=range;i++) {
			if((i%3==0)&&(i%5==0)) {
				sum=sum+i;
			}
		
		}
		
		return sum;
	}
	public static boolean isOdd(int number){
	     if(number>0){
	         if(number%2!=0){
	             return true;
	         }
	     }
	     return false;
	}
	 public static int sumOdd(int start , int end ){
	     int sum = 0;
	     if(end>=start&&end>0&&start>0){
	     for(int i=start;i<=end;i++){
	         if(isOdd(i)){
	             sum+=i;
	         }
	         
	     }
	     return sum;
	     
	 }
	     return-1;
	}
	 
	 
	 public static boolean isEven(int n ) {
		 if((n%2)==0) {
			 return true;
		 }
		 else {
			 return false;
		 }
		 
	 }
	 public static void  doWhile(int range) {
	do {
		System.out.println("hello"+range);
		range++;
	}while(range<5);
	 }
	 
	 public static void haalChal(String name) {
		 System.out.println("Hi how are you "+name);
	 }
	

}
