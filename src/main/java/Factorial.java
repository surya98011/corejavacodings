import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        System.out.println("enter the range of factorial");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int fact = 1;

        for (int i =1; i<=n;i++){
            fact = fact*i;
            System.out.println(" Factorial of "+i+" : "+fact);
        }
    }
}
