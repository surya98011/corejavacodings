package loops;
import java.util.Scanner;
public class SeriesSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner scn = new Scanner(System.in);
 int n = scn.nextInt();
 float sum = 0;
 for(float i =1;i<=n;i++) {
	 if(i%2==0) {
		 sum -=1/i;
	 }
	 else {
	 sum +=1/i;
 }
 }
 System.out.println(sum);
	}

}
