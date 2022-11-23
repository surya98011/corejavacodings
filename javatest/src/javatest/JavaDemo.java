package javatest;

public class JavaDemo {
	
	public static final int month = 3;
	
	 private static  void mathDemo() {
		 
		 //random[1,100] 
		 double random = Math.random();
		 int winner = (int) (random*100)+1 ;
		 System.out.println(random);
		 System.out.println(winner);
		 
	}
	public static void Printing(int i ) {
		
		for( ; i<=100;i++) {
			if (i==50) {
				return;
			}
		System.out.println(" love you anjali"+i);
		}
		boxPrimitives();
	}
	

private static void boxPrimitives() {
		// TODO Auto-generated method stub
	Integer boxedInt = Integer.valueOf(55);
	Boolean boxedBollean = Boolean.valueOf(true);
	
	Character boxedCharacter = Character.valueOf('h');
	Double boxedDouble = Double.valueOf(25.55);
	
//	for converting the boxed data into the primitive type 
//	we can use the method of "type value"
	int primitiveInt = boxedInt.intValue();
	boolean primitiveBool = boxedBollean.booleanValue();
	double primitiveDouble = boxedDouble.doubleValue();
	
	//parsing to the string -------parsetype
		
	}


//		private int id;
//		private String name;
//		private String gender;
	//	
//		public Course(int id, String name, String gender) {
//			super();
//			this.id = id;
//			this.name = name;
//			this.gender = gender;
//		}
	//
//		public int getId() {
//			return id;
//		}
	//
//		public void setId(int id) {
//			this.id = id;
//		}
	//
//		public String getName() {
//			return name;
//		}
	//
//		public void setName(String name) {
//			this.name = name;
//		}
	//
	//	
	//
//		public String getGender() {
//			return gender;
//		}
	//
//		public void setGender(String gender) {
//			this.gender = gender;
//		}

		
		
		static final int xy;
		static {
			xy = 4; // this variable is not a compile time constant 
			// as the value of the 4 will be assigned into the run time 
			// this case will not work for the switch cases label;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //System.out.println("Hello java");
 //Printing(20);
		mathDemo();
		final byte month1 = 1;
		int x = 2;
		
		switch(x) {
		
		case 1 : System.out.println("january");
		     break;
		case 2 : System.out.println("febuary");
		  break;
		case month : System.out.println("march");
		break;
		case 4  : System.out.println("april");
		break;
		
		}
		
		String data = "Hello surya kant pandey ji how are you"; 
		
		String [] items = data.split("\t");
		for (int i = 0; i<=items.length-1;i++) {
			System.out.println(items[i]);
		}
		
	}

}
