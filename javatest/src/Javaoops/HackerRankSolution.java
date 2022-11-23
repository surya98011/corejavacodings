package Javaoops;

import java.util.Scanner;

public class HackerRankSolution {
	static boolean flag;
	static int B;
	static int H;
	static{
	    Scanner scn = new Scanner(System.in);
	    B = scn.nextInt();
	    H = scn.nextInt();
	    if(B>0&&H>0){
	        flag=true;
	    }
	    else {
	       System.out.println("java.lang.Exception: Breadth and height must be positive");
	    }
	}

	public static void main(String[] args){
//			if(flag){
//				int area=B*H;
//				System.out.print(area);
//			}
int num=4526;
		System.out.println(getEvenDigitSum(num));  
		}
		
		
	//end of main
	public static int getEvenDigitSum(int number) {
		int sum =0 , temp;
		if(number<0) {
			return -1;
		}
		while(number>0) {
			temp=number%10;
			if(temp%2==0) {
				sum+=temp;
			}
			
		}
	return sum;	
	}


	}//end of class


