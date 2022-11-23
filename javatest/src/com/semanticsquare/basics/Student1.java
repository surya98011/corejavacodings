package com.semanticsquare.basics;

class Student1{

int id;
String name;
String gender = "male";

Student1(int id , String name){
	this(name);
	this.name=name;
	
}
Student1(String name){
	this.name=name;
	
}

boolean updateProfile(String name){
	
	this.name=name;
	return true;
	
	
}
@Override
public String toString(){
	return String.format(name);
}
static boolean UpdateDetail(Student1 s , String name){
	/*if(s==null){
		return false;
		
	}
	*/
	if (s!=null && s.id >=1000){
		s.name=name;
	}
		return true;
		
}
 static boolean isBadCredit = false;
static void loanApprove(int age , int sallary){
	
	if(age>35&&sallary>90000&&(!isBadCredit)){
		System.out.println("loan is approved");
	}
	else
	{
		System.out.println("sorry u are not eligible");
	}
}
public static void main(String[] args){
	
	loanApprove(37,90001);
	Student1 s = null;  //new Student1(101,"Surya");
	 UpdateDetail(s,"Sanjay");
	System.out.println(s.name);
	
}


}