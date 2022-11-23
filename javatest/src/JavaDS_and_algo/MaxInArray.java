package JavaDS_and_algo;

import java.util.Scanner;

public class MaxInArray {
	
	public static int maxOfArray(int []arr,int idx) {
		
		if(idx==arr.length-1) {
			return arr[idx];
		}
		
		int misa = maxOfArray(arr,idx+1);
		if(misa>arr[idx]) {
			return misa; //---- recursion case
		}else {
			return arr[idx];
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {4,23,43,65,76,117};
//Scanner scn = new Scanner(System.in);
//System.out.println("please enter the array");
//int n = scn.nextInt();
//int[]arr = new int[n];
//for (int i=0;i<arr.length;i++) {
//	arr[i]=scn.nextInt();
//}
int max = maxOfArray(arr,0);
System.out.println(max);
		
	}
	
	

}
