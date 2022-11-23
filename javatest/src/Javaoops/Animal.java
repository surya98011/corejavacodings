package Javaoops;

public class Animal {

	String name;
	//String type;
	int leg;
	int height;
	public Animal(String name, int leg, int height) {
		//super();
		this.name = name;
		//this.type = type;
		this.leg = leg;
		this.height = height;
	}
	
	public void run() {
		System.out.println("Hello my name is "+name);
		
		System.out.println("I am running ");
	}
	
	public void eat() {
		System.out.println("hello "+name+"is eating ");
	}
	
	public void speak() {
		
		System.out.println("hello My name is "+name);
		System.out.println("my height is :"+height);
		
		System.out.println("I have :" +leg+"legs");
	}
	
}
