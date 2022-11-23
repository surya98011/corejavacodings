package loops;
import java.util.Scanner;
public class Isprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
int num = scn.nextInt();
boolean isPrime = true;
for(int i = 2; i*i<=num;i++) {
	if(num%i==0){
		isPrime = false;
	}
}
if(num<2) isPrime=false;

System.out.println("is prime "+isPrime);



	}

}
