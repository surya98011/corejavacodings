package loops;

import java.util.Scanner;

public class Pattern4 {
	
	
	public static void pattern4() {
		Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	      for(int i=1;i<=n;i++) {
	    	  
	    	  
	    	  for(int j=1;j<=i-1;j++) {
	    		  System.out.print("");  
    	  }
	    	  for(int k=1;k<=n-i+1;k++) {
	    		  System.out.print("* ");
	    	  }
	    	  System.out.println();
	      }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern4();
	}

}
