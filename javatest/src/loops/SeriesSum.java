package loops;
import java.util.*;
public class SeriesSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner scn = new Scanner(System.in);
  int n = scn.nextInt();
   float sum=0f;
   for(float i=1;i<=n;i++) {
	   sum+=1/i;
   }
   System.out.println(sum);
	}

}
