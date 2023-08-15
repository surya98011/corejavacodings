import java.util.Scanner;

public class TakeArrayInputs {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println(" please enter the size of array");
        int n  = scn.nextInt();
        int [] arr = new int[n];
        System.out.println("enter "+ n+ " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        for (int x : arr ){
            System.out.print(x);
        }
    }
}
