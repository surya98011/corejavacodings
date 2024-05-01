import java.util.Scanner;

public class TernanryOeratorExample {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int input = scn.nextInt();
        String result = (input % 2 == 0) ? "Even number":"Odd number";
        System.out.println(result);
    }
}
