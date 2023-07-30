import java.util.Scanner;

public class A2ThePowerB {

    public static void main(String[] args) {
        System.out.println("enter the two numbers");
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();  int b = scn.nextInt();

        int answer =1;

        for (int i = 1; i<=b; i++){
            answer*=a;
        }
        System.out.println(a+" to the power "+ b+ " : "+ answer);
    }
}
