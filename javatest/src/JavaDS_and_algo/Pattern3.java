package JavaDS_and_algo;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      for(int i=1;i<=n;i++) {
    	  
    	  for(int j=1;j<=2*(i-1);j++) {
    		  System.out.print(" ");  
    	  }
    	  for(int k=1;k<=n-i+1;k++) {
    		  System.out.print("* ");
    	  }
    	  System.out.println();
      }
		
	}

}
