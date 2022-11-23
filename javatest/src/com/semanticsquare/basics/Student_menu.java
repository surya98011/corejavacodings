package com.semanticsquare.basics;

class Student_menu{

static int computecount ;
int Roll_no ;
String Name ;
int Mobile_number;
int fee;
String gender;

void Compute(){
	computecount = computecount +1;
System.out.println("\nroll no :" + Roll_no);
System.out.println("Student Name  :" + Name );
System.out.println("mobile number  :" + Mobile_number);
System.out.println("fee :" + fee);
System.out.println("gender :" + gender);
System.out.println(" computecount of the object is  :" + computecount);



}
public static void main ( String[] args){
	Student_menu s = new Student_menu();
	s.Roll_no = 111;
	s.Name = "Surya";
	s.Mobile_number = 123456;
    s.fee = 5000;
	s.gender = "male";
	
	Student_menu s1 = new Student_menu();
	s1.Roll_no = 112;
	s1.Name = "Surya pandey";
	s1.Mobile_number = 123458;
    s1.fee = 55000;
	s1.gender = "male";
	
	s1.Compute();
	s.Compute();
}
 
}
