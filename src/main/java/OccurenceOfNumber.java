import java.util.Scanner;

public class OccurenceOfNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(" please enter the size of array");
        int n  = scn.nextInt();
        int [] arr = new int[n];
        System.out.println("enter "+ n+ " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(" enter the target number to find the occurences");
        int target = scn.nextInt();
        //System.out.println(" the count of: "+target+" is "+countOccurences(arr,target));
        System.out.println("The last occurence of X: "+findLastOccurence(arr,target));

    }

    public static void printArrays(int [] arr){
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
    public static int countOccurences(int [] arr, int target){
        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==target){
                count++;

            }

        }
        return count;
    }

    public static int findLastOccurence(int [] arr, int target){
        int lastIndex=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                lastIndex = i;
            }
        }
        return lastIndex;
    }
}
