import java.util.Scanner;

public class FindUniqueElementInArrays {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(" please enter the size of array");
        int n  = scn.nextInt();
        int [] arr = new int[n];
        System.out.println("enter "+ n+ " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(findUnique(arr));

    }

    //find the unique number in the given array where all the elements being repeated twice
    // with one value being unique
    public static int findUnique(int [] arr){
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {

                if (arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i]>0){
                ans=arr[i];
            }

        }
        return ans;
    }
}
