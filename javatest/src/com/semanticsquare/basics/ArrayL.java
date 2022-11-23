package com.semanticsquare.basics;

class ArrayL{



static void PrintArray(){

//int [] Scores = new int[] {5,15,25,44,66};
 /* Student1 [] Students = new Student1 [5];

Students[0] = new Student1("surya");
Students[1] = new Student1("kant");
Students[2] = new Student1("juhi");
Students[3] = new Student1("ruhi");
Students[4] = new Student1("nisha");
*/

//Student1 [] Students = new  Student1 [] { new Student1("surya"),new Student1("kant"),new Student1("pandey"),new Student1(1,"juhi"),new Student1(2,"ruhi")};
//second way to declare the arrays of the object types 

Student1 [] Students =  { new Student1("surya"),new Student1("kant"),new Student1("pandey"),new Student1(1,"juhi"),new Student1(2,"ruhi")};
System.out.println(Students[0]);
System.out.println(Students[1]);

System.out.println(Students[2]);
System.out.println(Students[3]);
System.out.println(Students[4]);



}


public static void main(String[] args){


PrintArray();
  
  

}


}