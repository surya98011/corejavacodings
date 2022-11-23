package factorytest;


import java.util.Arrays;
import java.util.List;

public class JavaPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Classloader - there is 3 types of Classloader in java 1) System class loader, Extension Classloader, Bootstrap Classloader
		//if in the first time class is not find by System class loader then it checks with Extention class loader if it is
		//not found it checks with Bootstrap Classloader
		//if it is not found with any one it throws classnotfound exception
//		Integer in = null;
//	int x =5;
//	in = new Integer(x);
//	System.out.println(in);
//	Integer in1 = Integer.valueOf("400");
//	System.out.println(in1);
//	Integer intg = new Integer(55);
//	Integer intg1 = new Integer(55);
//	System.out.println(intg==intg1);
	//System.out.println(intg.equals(intg1));
		Integer intg =12;// autoboxing
		int xyz = intg.intValue();//autounboxing
		Integer intg1=12;
		System.out.println(intg);
		System.out.println(intg.equals(intg1));
		
List lst =	Arrays.asList("syrya","kant","pandey","village","jigani","pincode",802220);
System.out.println(lst);
//lst.add("murli");// array with as list does not support add or remove as it creates the fix sized arraylist
 String str2="surya";// this string will be created in the string const pool
 String str = new String ("surya");// this will be created in the heap
	String str1 =new String ("surya");
	System.out.println(str==str1);

	
	}

}
