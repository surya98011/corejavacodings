package com.semanticsquare.basics;

class Child
{

int id ;

 /*void update(Child c){
 c.id = 10002;
 System.out.println(id);
 }
 */
 static void varargsOverloaded(boolean Val , int a, int b , int c , int d){
	 System.out.println("output of without varargs method calling");
	 
 }
 
 static void varargsOverloaded(boolean Val , int... A){
	 System.out.println("print with varargs method");
 }
 public static void main(String [] args){
 
 /*Child c = new Child();
 c.id=10001;
 c.update(c);
 System.out.println(c.id);*/
 varargsOverloaded(true , 1,2,2,3);
 varargsOverloaded(true,1,2,3,4,5,6,7,8,9);
 varargsOverloaded(true);
 }

}