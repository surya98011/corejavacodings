import java.util.Scanner;

public class PrintArraySum {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println(" please enter the size of array");
        int n  = scn.nextInt();
        int [] arr = new int[n];
        System.out.println("enter "+ n+ " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(" enter the target number to find the pair sum in arrays");
        int target = scn.nextInt();

        System.out.println(printSum(arr,target));
    }

    //to find the pair sum in given arrays
    public static int printSum(int [] arr, int target){
        int n = arr.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i]+arr[j]==target){
                    ans++;
                }
            }

        }
       return ans;
    }
}
