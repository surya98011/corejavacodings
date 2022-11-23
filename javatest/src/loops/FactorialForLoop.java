package loops;
import java.util.*;
public class FactorialForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scn = new Scanner(System.in);
     int num = scn.nextInt();
     long result =1;
     for(int i =num;i>=1;i--) {
    	 result*=i;
     }
     System.out.println(result);
	}

}
