package com.semanticsquare.basics;

class student{

int rollno;
int marks;
String name;
String gender;
int age;

student(){
	System.out.println("hello this the no args construtor");
}

student(int newrollno , int newmarks, String newname, String newgender,int newage){
	//this(newrollno,newmarks,newname,newgender);//instead of calling the different overloaded conctr we can use this keyword invocation statement
rollno= newrollno;
marks=newmarks;
name=newname;
gender=newgender;
age=newage;

compute();

}
void compute(){
	
	System.out.println("\nroll number is : "+rollno);
	System.out.println("marks is : "+marks);

	System.out.println("name is : "+name);

	System.out.println("gender is : "+gender);

	System.out.println("age is : "+age);

}
boolean update(String name){
	
	this.name = name;
	return true;
}
public static void main(String [] args){
	student s = new student(123,55,"surya","male",24);
	student s1 = new student(124,60,"Shashibala","female",22);
	student s3 = new student(125,65,"lawkush","male",28);

	//student s4 = s1;
	//s.compute();
	boolean holdvalue = s1.update("pandeyji");
	System.out.println(s1.name);
	System.out.println(holdvalue);
}


}