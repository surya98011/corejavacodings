package com.semanticsquare.basics;

class Demo{

public static  void arrays(){

//int[] scores = new int[6]; // first way to initialize arrays
//int [] scores = new int [] {90,80,95,100,120,50}; // second wayto declare arrays
/*int [] scores = {55,60,88,47,7};
scores[0] = 90;
scores[1] = 80;
scores[2] = 95;
scores[3] = 100;
scores[4] = 120;
scores[5] = 50;
System.out.println("\nthe scores of the student is\n");
System.out.println("Score of midsem1 : " + scores[0]);
System.out.println("Score of sem2 : " + scores[1]);
System.out.println("Score of sem3 : " + scores[2]);
System.out.println("Score of sem4 : " + scores[3]);
System.out.println("Score of sem5 : " + scores[4]);
System.out.println("Score of final : " + scores.length);*/
Demo [] demo = new Demo[4];
 demo[0] = new Demo();
 demo [1] = new Demo();
 demo[2] = new Demo();
 demo[3] = new Demo();
 System.out.println(demo[0]);
System.out.println(demo[1]);
System.out.println(demo[2]);
System.out.println(demo[3]);
//System.out.println("Score of sem4 : " + scores[3]);

}
public static void main ( String args[]){

	arrays();
	//gokrna
	
}
}