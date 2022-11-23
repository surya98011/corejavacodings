package Javaoops;

public class Human {
	
	String name;
	int age;
	int heightInLength;
	String eyecolor;
	
	
	
//	Human(String name , int age , int height , String coloreye){
//		this.name  = name;
//		this.age= age;
//	}
	
	public Human(String name, int age, int heightInLength, String eyecolor) {
		super();
		this.name = name;
		this.age = age;
		this.heightInLength = heightInLength;
		this.eyecolor = eyecolor;
	}
	public void speak() {
		System.out.println("Hello my name is "+name);
		System.out.println("my age is :"+age);
		System.out.println("my height is = "+heightInLength);
		System.out.println("my eyecolor is = "+eyecolor);
	}
	public void eat() {
		System.out.println("hello I am eating now ");
		
	}
	
	public void sleep() {
		System.out.println("Hello I am sleeping now");
	}
	
	public void cry() {
		System.out.println("Hello i am crying ");
		
	}
	

	

}
