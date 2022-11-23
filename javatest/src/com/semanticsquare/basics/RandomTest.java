package com.semanticsquare.basics;

class RandomTest{
	
	//int index = 0;
	static void ArrayTest(){
		int index = 0;
int [] arraytest = new int[15];
arraytest[index++] = 55;
arraytest[index++] = 60;
arraytest[index++] = 65;
arraytest[index++] = 70;
System.out.println(arraytest[index]);

System.out.println(index);

	}
	public static void main(String[] args){
		
		ArrayTest();
		int x = 100;
System.out.println(x+=5);
System.out.println(x-=5);
System.out.println(x*=5);
System.out.println(x/=5);
System.out.println(x%=5);

	}
	
}