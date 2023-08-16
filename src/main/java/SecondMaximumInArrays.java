import java.util.Scanner;

public class SecondMaximumInArrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(" please enter the size of array");
        int n  = scn.nextInt();
        int [] arr = new int[n];
        System.out.println("enter "+ n+ " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(findSecondMax(arr));
    }

    public static int findMaximum(int [] arr){
        int n = arr.length;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i <n ; i++) {
            if(arr[i]>ans){
                ans=arr[i];
            }
        }
        return ans;
    }
    public static int findSecondMax(int [] arr) {

        int n = arr.length;
    int max = findMaximum(arr);
        for (int i = 0; i < n; i++) {
            if (arr[i]==max){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = findMaximum(arr);

        return secondMax;
    }

}
