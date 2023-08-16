import java.util.Scanner;

public class TripletSumArrays {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(" please enter the size of array");
        int n  = scn.nextInt();
        int [] arr = new int[n];
        System.out.println("enter "+ n+ " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(" enter the target number to find the triplets");
        int target = scn.nextInt();
        System.out.println(tripletSum(arr,target));
    }

    // count the number of triplets whose sum is equal to the given targets
    public static int tripletSum(int arr[], int target){

        int n = arr.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {//finding first number
            for (int j = i+1; j < n; j++) { // finding second number
                for (int k = j+1; k <n ; k++) { // finding third number
                    if(arr[i]+arr[j]+arr[k]==target){
                        ans++;
                    }
                }
            }
        }
return ans;
    }
}
