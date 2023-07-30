import java.util.Arrays;

public class TwoDArray {

    public static void main(String[] args) {

        //int arr[][] = new int[6][];
        int arr[][]= {

                {4,5,6,7,8},
                {7,8,9,2},
                {2,3,5,6,9,8,7},
                {1,2,3,6,5,4,7,8,9}

        };
        for (int j [] : arr)
        System.out.println(Arrays.toString(j));

        System.out.println(arr[3]);



    }
}
