package operators;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// calculator using switch stmt
		Scanner scn = new Scanner(System.in);
		System.out.println("enter first number :");
		int a = scn.nextInt();
		System.out.println("enter secnd number :");
		int b = scn.nextInt();
		System.out.println("enter the operation :");
		scn.nextLine();
		char operation = scn.nextLine().charAt(0);
		int result =0;
		switch(operation) {
		case '+':
			result = a+b;
			break;
		case '-':
			result = a-b;
			break;
		case '*':
			result=a*b;
			break;
		case '/':
			result = a/b;
			break;
		default :
			System.out.println("Could not find any operation");
		}
		System.out.println(result);
	}

}
