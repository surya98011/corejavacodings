package loops;
import java.util.Scanner;
public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
//break statement in infinite loop
		for(;;) {
			int n = scn.nextInt();
			if(n<0) {
				System.out.println("going out of loop");
				break;
				
				
			}
			else {
				System.out.println("hello Surya");
			}
		}
		
	}
public static void printTables(int n) {
		
		for(int i = 1; i<=n;i++) {
			for(int j=1;j<=10;j++) {
				System.out.print(i*j+" ");
			}
			System.out.println();
		}
		
	}


}
