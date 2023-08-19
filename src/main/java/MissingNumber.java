import java.util.Scanner;

public class MissingNumber {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the size of array");
        int n  = scn.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter "+ n+ " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(findMissingNumber(arr));

    }

    public static int findMissingNumber(int [] arr){

        int n = arr.length+1;
        int totalSum = n*(n+1)/2;
        int arraySum = 0;
        for (int i : arr) {
            arraySum += i;
        }
      int  missingNum = totalSum-arraySum;
        return missingNum;
    }
}
