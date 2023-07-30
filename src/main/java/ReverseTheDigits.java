import java.util.Scanner;

public class ReverseTheDigits {
    public static void main(String[] args) {
        System.out.println("Enter the number to be reversed");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int original_n = n;
        int answer = 0;

        while(n>0){

            answer = answer*10 + n%10;
            n/=10;
        }
        System.out.println("The reversed number of "+original_n+ " is "+answer );
    }
}
