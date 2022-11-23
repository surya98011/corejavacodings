package loops;
import java.util.*;
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner scn = new Scanner(System.in);
 int a = scn.nextInt();
 int b = scn.nextInt();
 int result = 1;
 for(int i = 0;i<=b;i++) {
	 result *=a;
	 
 }
 System.out.println(result);
	}

}
