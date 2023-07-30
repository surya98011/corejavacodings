import java.util.Scanner;

public class SumOfGivenSeries {

    public static void main(String[] args) {
        System.out.println("enter the range of series");
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int answer = 0;
        int i =1;
        while(i<=n){ // using while loop
            if(i%2==0)
                answer -= i;
            else
                answer += i;
          i++;
        }
        System.out.println(answer);

// using for loop

//        for (int i = 1; i<=n; i++){
//            if(i%2 == 0){
//                answer -= i;
//            }
//            else {
//                answer += i;
//            }
//        }
      //  System.out.println(answer);

    }
}
