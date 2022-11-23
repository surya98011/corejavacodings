package loops;
import java.util.*;
public class SumOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scn = new Scanner(System.in);
   int tableOf = scn.nextInt();
   //System.out.println(sumOfNthNumber(number));
   // reverse counting
//   for (int i =100;i>=1;i--) {
//	   System.out.println(i);
//   }
   // to print the table of numbers
//   for(int i =1;i<=10;i++) {
//	   System.out.println(tableOf+"x"+i+"="+tableOf*i);
//   }
//   for(int i =1;i<1;) {// it is valid loop dispite of third condition
//	// this loop goes to infinite   
//   }
//   for(int i=1; ; i++) {
//	   // this loope is also valid and goes to infinite
//   }
//   for( ; ;) {
//	   System.out.println("hello surya");
//	   // this also oes to infinite loop
//   }
	}
	
	public static int sumOfNthNumber(int n) {
		long time;
		int  sum = 0;
		for (int i = 0; i <=n;i++) {
			sum+=i;
			 time = System.currentTimeMillis();
				System.out.println(time);
		}
		
		return sum;

	}
	
	
	

}
