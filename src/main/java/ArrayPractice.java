import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ArrayPractice {

    public static void main(String[] args) {
        // do declare the arrays
        // data type [] arrays name = new data type [size];

       // Scanner sc = new Scanner(System.in);

       // int [] rollNo = new int[6];
       // rollNo[1] = 55;
      //  for (int i = 0; i < rollNo.length; i++) {

      //      rollNo[i] = sc.nextInt();

       // }
      //  System.out.println(Arrays.toString(rollNo));
//        IntStream.range(0, rollNo.length).forEach(i -> {
//            System.out.println("enter the index of the element");
//            int n = sc.nextInt();
//            System.out.println(rollNo[n]);
//        });

//        for (int j : rollNo){
//            System.out.println(j);
//        }
        //System.out.println(rollNo.length);
       // printArraySum();
       // maxOfArrays();
       // searchInArrays();
       // printPositiveNumbersOfArray();
        printArraysInput();

    }

    static void printArraySum(){
        int arr [] = {5,3,6};
        int sum = 0;
        for (int i = 0;i< arr.length;i++){
            sum += arr[i];
        }
        System.out.println("the sum of total elements is " + sum);
    }

    static void maxOfArrays(){
        int arr[] = {5,6,8,3,11};
        int answer =0;
        for(int i = 0; i<arr.length;i++){
            if (arr[i]>answer){
                answer=arr[i];
            }
        }
        System.out.println("max " +answer);
    }
    public static void searchInArrays(){
        int arr [] = {5,6,4,2,3,8,7,9,6};
        int target = 6;
        int answer = -1;
        for (int i =0;i<arr.length;i++){
            if (arr[i] == target ){
                answer=i;
                break;
            }
        }
        System.out.println(answer);
    }

    public static void printPositiveNumbersOfArray(){
        //given
        int arr [] = {2,6,-5,-1,0,4,-9};
        for(int i=0;i< arr.length;i++){
            if(arr[i]>=0){
                System.out.println(arr[i]);
            }
        }
        int arr1 [] = arr.clone();

    }
    public static void printArraysInput(){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
   int arr [] = new int[n];
   System.out.println(" enter the " + n+ " elements ");
       for(int i =0;i<arr.length;i++){
           arr[i]= sc.nextInt();
       }
        for(int i =0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

   static void printArray(int [] arr){
        for (int i : arr){
            System.out.println(i+" ");
        }
    }
}
