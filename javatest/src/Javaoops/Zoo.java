package Javaoops;

public class Zoo {

	
	public static void main(String args[]) {
		
		Animal monkey;
		monkey = new Animal("monkey",4,20);
		Animal elephant;
		elephant = new Animal("elephant",4,80);
		
		monkey.speak();
		monkey.eat();
		monkey.run();
		elephant.speak();
	}
}
