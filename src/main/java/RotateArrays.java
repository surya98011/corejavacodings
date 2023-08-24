import java.util.Scanner;

public class RotateArrays {

    static int [] rotate(int [] arr, int k){

        int n = arr.length;
        k = k%n;
        int [] ans = new int[n];
        int j = 0; // with the help of j we will put values in ans array;

        for (int i = n-k; i <n ; i++) {

            ans[j++] = arr[i];

        }
        for (int i = 0; i <n-k ; i++) {

            ans[j++] = arr[i];

        }
        return ans;
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
        System.out.println(" enter the value K to rotate ");
        int k = scn.nextInt();
        System.out.println("original arrays");
        printArrays(arr);

        int[] rotate = rotate(arr, k);
        System.out.println(" arrays after rotate");
        printArrays(rotate);



    }
    public static void printArrays(int [] arr){
        //helper methods to just print the arrays

        for (int x : arr){
            System.out.print(x+ "  ");
        }
        System.out.println();
    }
}
