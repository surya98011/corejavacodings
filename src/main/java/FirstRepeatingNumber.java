import java.util.Scanner;

public class FirstRepeatingNumber {

    public static int findFirstRepeatingNumber(int [] arr){

        int n = arr.length;

        for (int i = 0; i < n; i++) { // find first number
            for (int j = i+1; j <n ; j++) { // find second repeating number
                if(arr[i]==arr[j]){
                    return arr[i];
                }

            }
        }
return -1; // if there is no any value found repeating we can return -1
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
        System.out.println("the first repeating number is "+ findFirstRepeatingNumber(arr));
    }
}
