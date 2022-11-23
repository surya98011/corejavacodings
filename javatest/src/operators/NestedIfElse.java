package operators;
import java.util.Scanner;
public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("please enter the number :");
     int a = scn.nextInt();
     int b = scn.nextInt();
     int c = scn.nextInt();
     int max=0;
//     if(a>b) {
//    	 if(a>c) {
//    		 max=a;
//    	 }
//    	 else {
//    		 max=c;
//    	 }
//     }
//     else {
//    	 if(b>c) {
//    		 max=b;
//    	 }
//    	 else {
//    		 max=c;
//    	 }
//     }
     // maximum number using a ternary operator
     max=a>b?a>c?a:c:b>c?b:c;
     System.out.println("the maximum number is : "+max);
	}

}
