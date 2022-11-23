package com.semanticsquare.basics;

class Saasbahu{
	Saasbahu(int a , int b){
		
		System.out.println("two variables constrctr is been called");
	}
	Saasbahu(int marks , int rollno , String name ){
		
		System.out.println("hi :"+ name + " you got "+ marks);
		System.out.println("but your marks is very less to clear the ICAR round"+name);
	}
	public static void main (String [] args){
		Saasbahu s = new Saasbahu(1,2);
		Saasbahu s1  = new Saasbahu(55,123,"Ruhi");
	}
	
}