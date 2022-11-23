package javatest;

public class StudentTest {

	    // variable declarations	
		private static int studentCount;
		
		private static int idInitializer = 1000;
	    private final int id; 
	    private String name; 
	    private String gender = "male";
		
		public String getName() {
		   return name;
		}
		
		public void setName(String name) {
		   this.name = name;
		}
		
		public static int getStudentCount() {
		    return studentCount;
		}
		
		// Constructors
		public StudentTest(String name, String gender) {
		    this.name = name;
			this.gender = gender;
			
			id = ++idInitializer;
			studentCount++;
			System.out.println("ID of " + name + " is " + id);
			System.out.println(name);
			System.out.println(gender);

		}
		
	    // method definitions
	    public boolean updateProfile(String name) {
		   this.name = name;
	       return true;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentTest s = new StudentTest("anjali","female");
		System.out.println(s);
	}

}
