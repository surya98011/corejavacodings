package javatest;

public class Course {
//	private int id;
//	private String name;
//	private String gender;
//	
//	public Course(int id, String name, String gender) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.gender = gender;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	
//
//	public String getGender() {
//		return gender;
//	}
//
//	public void setGender(String gender) {
//		this.gender = gender;
//	}

	
		 private static  void mathDemo() {
			 
			 //random[1,100] 
			 double random = Math.random();
			 int winner = (int) (random*100)+1 ;
			 System.out.println(random);
			 System.out.println(winner);
			 
		}
		 public static void main (String args[]) {
			 mathDemo();
		 }
}
