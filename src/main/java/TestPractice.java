import java.util.Scanner;

public class TestPractice {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int length = scn.nextInt();
        int arr [] = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

    }
}
