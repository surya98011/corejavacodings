import java.util.Scanner;

public class FindStrictlyGreaterNumbers {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(" please enter the size of array");
        int n  = scn.nextInt();
        int [] arr = new int[n];
        System.out.println("enter "+ n+ " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(" enter the target number to count the greater values ");
        int target = scn.nextInt();


        int strictlyGreaterNumbersInArray = findStrictlyGreaterNumbersInArray(arr, target);
        System.out.println(strictlyGreaterNumbersInArray);

    }

    static int findStrictlyGreaterNumbersInArray(int arr [], int target){

        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i]>target){
                count++;
            }

        }
        return count;
    }
}
