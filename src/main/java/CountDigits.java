import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int numberOfDigits = 0;
        int original_n = n;
        while (n>0){
            n=n/10;
            numberOfDigits++;

        }
        System.out.println("Number of digits in "+original_n+" = "+numberOfDigits);
    }
}
