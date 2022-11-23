package javatest;

public class ProductOfDigit {

	 
	  
	    /* Function to get product of digits */
	    static int getProduct(int n) 
	    { 
	        int product = 1; 
	  
	        while (n != 0) { 
	            product = product * (n % 10); 
	            n = n / 10; 
	        } 
	       // System.out.println(product);
	  
	        return product; 
	    } 
	  
	    // Driver program 
	   
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 4513; 
		  int x = 4513/10;
		  System.out.println(x);
	        System.out.println(getProduct(n)); 
	}

}
