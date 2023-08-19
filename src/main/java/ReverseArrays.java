public class ReverseArrays {

    static int [] reverseArrays(int [] arr){
        int n = arr.length;
        int ans[] = new int[n];
        int j =0;
        for (int i = n-1; i >=0 ; i--) {
            ans[j++] = arr[i];
        }
        return ans;
    }


    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};
        reverseArraysInPlace(arr);

        printArrays(arr);
       // printArrays(reverseArraysUsingWhileLoop(arr));
//        printArrays(arr);
//        System.out.println("=======================");
//
//        printArrays(reverseArrays(arr));

    }


    public static void printArrays(int [] arr){
        //helper methods to just print the arrays

        for (int x : arr){
            System.out.print(x+ " ");
        }
        System.out.println();
    }

    public static int [] reverseArraysUsingWhileLoop(int [] arr){

        int n = arr.length;
        int ans [] = new int[n];
        int i = n-1, j=0;
        while (j<n){

            ans[j++] = arr[i--];
        }
       return ans;
    }

    static void reverseArraysInPlace(int [] arr) {
        int i = arr.length - 1;
        int j = 0;
        while (i > j) {
            swapInArrays(arr, i, j);
            i--;
            j++;
        }
    }
    private static void swapInArrays(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
