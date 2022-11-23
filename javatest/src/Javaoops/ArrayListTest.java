package Javaoops;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] age = new int[5];
		Scanner scn = new Scanner(System.in);
		//age[0]=5;
		for(int i=0;i<age.length;i++) {
			// take input using for loop
			age[i]=scn.nextInt();
		}
		
//		for(int i=0;i<age.length;i++) {
//			System.out.print(age[i]+" ");
//		}
//		for(int num : age) {
//			System.out.print(num+" ");
//		}
		System.out.print(Arrays.toString(age));
			}
		
		}
