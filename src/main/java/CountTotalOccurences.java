import java.util.Scanner;

public class CountTotalOccurences {

    public static int findTotalOccurenceOfANumber(int [] arr, int x){

        int n = arr.length;
        int ans = 0;

        for (int i = 0; i < n ; i++) {
                if (arr[i]==x){
                    ans++;
                }
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
        System.out.println(" enter the target number to find the occurences");
        int target = scn.nextInt();

        System.out.println(findTotalOccurenceOfANumber(arr,target));
    }
}
