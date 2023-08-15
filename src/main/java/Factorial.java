import java.util.ArrayList;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList();
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
