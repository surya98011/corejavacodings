import java.util.Scanner;

public class PairOfAbsoluteDifference {

    public static void findAbsoluteDifferencePair(int[] arr, int x){

        int n = arr.length;
        //boolean ans = false;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <n ; j++) {
               if(arr[j]-arr[i]==x){ // arr[j] - arr[i] because the array is sorted in increasing order
                   System.out.println("yes");
                   return;
               }
            }

        }
        System.out.println("No");
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(" please enter the size of array");
        int n  = scn.nextInt();
        int [] arr = new int[n];
        System.out.println("enter "+ n+ " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(" enter the target number to find the difference");
        int target = scn.nextInt();

        findAbsoluteDifferencePair(arr,target);
    }
}
