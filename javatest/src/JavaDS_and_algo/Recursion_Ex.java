package JavaDS_and_algo;

public class Recursion_Ex {
	
	public static void printDecreasing(int n) {
		
		if(n==0) {
			return;
		}
		
		System.out.println(n);
		printDecreasing(n-1);
		//System.out.println(n);
	}
	
	public static void printIncreasing(int n) {
		if(n==0) {
			return;// base case
		}
		
		printIncreasing(n-1);
		System.out.println(n);
	}
	
	public static void printIncreasingDecreasing(int n) {
		if(n==0) {
			 return;// base case
		}
		System.out.println(n);
		printIncreasing(n-1);
		System.out.println(n);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 4;
		printDecreasing(n);
		//printIncreasing(n);
		//printIncreasingDecreasing(n);
	}

}
