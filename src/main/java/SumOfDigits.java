import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int sumOfDigits = 0;
        int original_n = n;
        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;
if(n>minValue && n<maxValue)
        while (n>0){

            sumOfDigits +=n%10;

            n = n / 10;

        }
    System.out.println("Sum of digits in "+original_n+" = "+sumOfDigits);

    }
}
