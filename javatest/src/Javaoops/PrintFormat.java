package Javaoops;

import java.util.Scanner;

public class PrintFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%04d%n" ,s1,x);
            //Complete this line
        }
        System.out.println("================================");

}
	public static void endOfFile() {

		Scanner scn = new Scanner(System.in);
        int i=1;
        while(scn.hasNext()){
            System.out.println(i+" "+scn.nextLine());
            i++;
        }
        scn.close();
    }
	
	
}



	


