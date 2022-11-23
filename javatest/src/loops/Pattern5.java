package loops;
import java.util.Scanner;
public class Pattern5 {

	public static void main(String[] args) {
 /* * 
   * * 
  * * * 
 * * * * 
* * * * * */ // this triangle pattern

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for(int i = 1; i<=n;i++) {
			for(int j = n-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int k = 1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
