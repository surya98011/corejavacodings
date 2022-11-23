package JavaDS_and_algo;

import java.util.Map;

public class Recursion_algo {

	//normal example of recursion
	public static int factorial(int n) {
		if (n>=1) {
		
			return n*factorial(n-1);
		}
		else {
			return 1;
		}
	}
	
	// fabonacci with recursion
	public static int fibonac(int n) {
		if(n==1 || n==2) {
			return 1;
		}
		return fibonac(n-1)+fibonac(n-2);
	}
	// fabonacci with recursive + memoization
	public static int fibonacMemo(int n,Map m) {
		if(n==1 || n==2) {
			return 1;
		}
		if(m.containsKey(n)) {
			m.get(n);
		}
		int result = fibonac(n-1)+fibonac(n-2);
		m.put(n, result); return result;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int res=factorial(5);
//System.out.println(res);
int store = fibonac(7);
System.out.println(store);
	}

}
