package loops;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// continue keyword used in the loop to skip the current iteration and move to the next one
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				continue;
			}// this will skip all the even number 
			System.out.println(i);
		}
	}
	
	
}
