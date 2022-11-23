package operators;
import java.util.Scanner;
public class ArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner scn = new Scanner(System.in);
 int a = scn.nextInt();
 int b = scn.nextInt();
 int result = a*a+b*b+2*a*b;// to print (a+b)^2
 System.out.println(result);
	}
	

}
