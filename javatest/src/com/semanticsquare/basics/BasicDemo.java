package com.semanticsquare.basics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class BasicDemo {
	
public 	BasicDemo(){
		System.out.println("inside the no arg constructor..");
		
	}


	static {
		// static initializer
		// here we can not reference the 
		//instance variables or instance members
		System.out.println("inside static block...");
	}
	
	{
		// non static block or instance initializer
		// it is useful when we have to share some 
		//block of code between multiple constructor
		System.out.println("inside the instance initializer...");
	}
	
	
			
		// Adapted from http://www.ntu.edu.sg/home/ehchua/programming/java/J1a_Introduction.html
	    static void print() {
	      System.out.println("\n\nInside print ...");
	      System.out.println("Hello, world!!"); // Advance cursor to beginning of next line
	      System.out.println();                 // Print empty line
	      System.out.print("Hello, world!!");   // Cursor stayed after the printed string
	      System.out.println("Hello,");
	      System.out.print(" ");                // Print a space
	      System.out.print("world!!");
	    }
	    	
		static void primitives() {
		  System.out.println("\n\nInside primitives ..."); 
		  // literals demo
		  int intHex = 0x0041;
		  System.out.println("intHex: " + intHex);
		  int intBinary = 0b01000001;
		  System.out.println("intBinary: " + intBinary);
		  int intChar = 'A'; // holds decimal equivalent, which is 65
		  System.out.println("intChar: " + intChar);
		  int intUnderscore = 1_23_456;
		  System.out.println("intUnderscore: " + intUnderscore);
		  
		  char charA = 'A';
		  System.out.println("charA: " + charA);
		  char charInt = 65;
		  System.out.println("charInt: " + charInt);
		  char charUnicode1 = '\u0041'; // 4 * (16 power 1 )+ 1 * (16 power 0)
		  System.out.println("charUnicode1: " + charUnicode1);
		  char charHex = 0x41;     // 4 * (16 power 1 )+ 1 * (16 power 0)
		  System.out.println("charHex: " + charHex);
		  char charBinary = 0b01000001; // binary corresponding to decimal 65
		  System.out.println("charBinary: " + charBinary);
	    }
		
		public static void booleanDemo() {
			  System.out.println("\n\nInside booleanDemo ..."); 
			  boolean isInsured = true;
			  double coverageByInsurance = 0.8;
			  double billAmount = 1000.0;
			  
			  double amountPaidByInsurance = 0.0;
			  double amountPaidByPatient = billAmount;
			  
			  if (isInsured) {
				amountPaidByInsurance = billAmount * coverageByInsurance;
				amountPaidByPatient = billAmount - amountPaidByInsurance;
			  }
			  
			  System.out.println(amountPaidByInsurance);
			  System.out.println(amountPaidByPatient);
		}
			
	    static void typeCasting() {
	      System.out.println("\nInside typeCasting ...");
	      // Explicit casting
	      long y = 42;
	      //int x = y;
	      int x = (int)y;
	      
	      // Information loss due to out-of-range assignment
	      byte narrowdByte = (byte)123456;
		  System.out.println("narrowdByte: " + narrowdByte); 
		  
		  // Truncation
		  int iTruncated = (int)0.99;
		  System.out.println("iTruncated: " + iTruncated); 
		  
		  // Implicit cast (int to long)
		  y = x;
		  
		  // Implicit cast (char to int)
		  char cChar = 'A';
		  int iInt = cChar; 
		  System.out.println("iInt: " + iInt);
		  
		  // byte to char using an explicit cast
		  byte bByte = 65;
		  cChar = (char)bByte; // special conversion (widening from byte --> int followed by narrowing from int --> char)
		  System.out.println("cChar: " + cChar);
	    }
		
		static void arrays() {
		      System.out.println("\nInside arrays ...");
			  int[] scores = new int[4];	

			  scores[0] = 90;
			  scores[1] = 70;
			  scores[2] = 80;
			  scores[3] = 100;
			  
			  /*int[] scores = new int[] {90, 70, 80, 100};*/
			  
			  //int[] scores = {90, 70, 80, 100};
			  
			  System.out.println("Mid-Term 1: " + scores[0]);
			  System.out.println("Mid-Term 2: " + scores[1]);
			  System.out.println("Final: " + scores[2]);
			  System.out.println("Project: " + scores[3]);
			  System.out.println("# exams: " + scores.length);
			  
			  student[] students = new student[3];//{new Student(), new Student(), new Student()};
			  students[0] = new student();
			  students[1] = new student();
			  students[2] = new student();
			  students[0].name = "John";
			  students[1].name = "Raj";
			  students[2].name = "Anita";
			  System.out.println("Student 1: " + students[0]);
			  System.out.println("Student 2: " + students[1]);
			  System.out.println("Student 3: " + students[2]);
		  }	
		
	    private static void print(int i) {
			System.out.println("element: " + i);		
		}

		static void threeDimensionalArrays() {
		   System.out.println("\nInside threeDimensionalArrays ...");
		   int[][][] unitsSold = new int[][][]{ 
											   { // New York
												 {0,0,0,0}, // Jan
												 {0,0,0,0}, // Feb
												 {0,0,0,0}, // Mar
												 {0,850,0,0}// Apr	
											   },
											   { // San Francisco
												 {0,0,0,0}, // Jan
												 {0,0,0,0}, // Feb
												 {0,0,0,0}, // Mar
												 {0,0,0,0}  // Apr
											   },
											   { 
												 {0,0,0,0},
												 {0,0,0,0},
												 {0,0,0,0},
												 {0,0,0,0}
											   },
											   {
												 {0,0,0,0},
												 {0,0,0,0},
												 {0,0,0,0},
												 {0,0,0,0}
											   }
											 };
			                    	 
			System.out.println("unitsSold[0][3][1]: " + unitsSold[0][3][1]);
		}	
		
		static void varargsOverload(boolean b, int i, int j, int k){
		   System.out.println("\nInside varargsOverload without varargs ...");
		}
		static void varargsOverload(boolean b, int... list){
		   System.out.println("\nInside varargsOverload with varargs ...");
		   System.out.println("list.length: " + list.length);
		   int sum = 0;
		   for (int i : list) {
			   sum += i;
		   }
		   
		   System.out.println("sum: " + sum);
		}	
		
		static void preAndPost() {
			System.out.println("\nInside preAndPost ...");
			
			int x = 5;
			
			//--x;		
			//System.out.println("x: " + x);	

			//int y = x--;		
			//System.out.println("y: " + y + ", x: " +  x);
			
			int index = 0;
			int[] array = new int[3];
			array[index++] = 10;		
			array[index++] = 20;		
			array[index++] = 30;
			
			System.out.println(index);
		}
		
		
		static void compoundArithmeticAssignment() {
			int x = 100;
			
			System.out.println("x += 5: " + (x += 5));
			System.out.println("x -= 5: " + (x -= 5));
			System.out.println("x *= 5: " + (x *= 5));
			System.out.println("x /= 5: " + (x /= 5));
			System.out.println("x %= 5: " + (x %= 5));
			
			// Invalid
			System.out.println("x =+ 5: " + (x =+ 5)); // Unary plus ~ x = +5
			System.out.println("x =- 5: " + (x =- 5)); // Unary minus ~ x = -5
			/*System.out.println("x =* 5: " + (x =* 5));
			System.out.println("x =/ 5: " + (x =/ 5));
			System.out.println("x =% 5: " + (x =% 5));*/
		}
		
		static void isOddOrEven(int num) {
			System.out.println(num % 2);
		}
		
		static void charTypePromotion() {
			  System.out.println("\nInside charTypePromotion ...");
			  char char1 = 50; // Will be assigned corresponding UTF16 value 2
			  System.out.println("char1: " + char1); 
			  System.out.println("(73 - char1): " + (73 - char1)); // char1 gets promoted to int, i.e., decimal equivalent 50 in UTF16 is used	  
			  System.out.println("(char1 - '3'): " + (char1 - '3')); // char1 & '3' are promoted to ints	
			  System.out.println("('a' + 'b'): " + ('a' +'b')); // 'a' & 'b' are promoted to ints and the respective equivalents 97 & 98 are added
		}
		
		// Comparison or Relational operators
			static void comparisonOperators() {
			    System.out.println("\nInside comparisonOperators ...");
				int age = 20;
			    /*if (age > 21) {
					System.out.println("Graduate student");
				}*/
				System.out.println("age > 21: " + (age > 21));
				System.out.println("age >= 21: " + (age >= 21));  
				System.out.println("age < 21: " + (age < 21));
				System.out.println("age <= 21: " + (age <= 21));	  
				System.out.println("age == 21: " + (age == 21)); // equal to (equality operator)
				System.out.println("age != 21: " + (age != 21)); // not equal to (equality operator)
				
				boolean isInternational = true;
				//System.out.println("isInternational <= true: " + (isInternational <= true));  
				System.out.println("isInternational == true: " + (isInternational == true)); 
				System.out.println("isInternational != true: " + (isInternational != true));
				
				/*Student s1 = new Student(1000, "Dheeru");
				Student s2 = new Student(1000, "Dheeru");
				System.out.println("s1 == s2: " + (s1 == s2)); // See object class
				System.out.println("s1 != s2: " + (s1 != s2));
				
				update(s1, "John");*/
			}		
			
			/*static boolean update(Student s, String name) {
			    if (s == null) {
				   return false;
				}
				
				s.name = name;		
				return true;
			}*/
		
		static void logicalOperators() {
			System.out.println("\nInside logicalOperators ...");
			int age = 37;
		    int salary = 85000;
		    boolean hasBadCredit = false;
			
			// 1. Core (AND, OR, NOT & Operator Chaining)
		    
		    if (age > 35 && salary > 90000 || !hasBadCredit) {
		    	System.out.println("Loan approved!");
		    } else {
				System.out.println("Loan not approved!");
			}
			
			// 2. 
			//    (a) Left-associative ~ Order of grouping
			//    (b) Associativity (a && b) && c = a && (b && c)
			//    Applies to both && and ||
			
			
			// 3. 
			//    (a) Operator precedence of Logical Operators: Helps with ONLY grouping operations. Not order of execution. (! > && > ||)
			
			          // Other Examples: A && B || C && D = (A && B) || (C && D)
					  //                 A && B && C || D = ((A && B) && C) || D
			
			
			//    (b) Operator Precedence across logical, comparison and arithmetic
			//          ! > arithmetic > comparison > &&, ||
			//    See resources section for complete precedence rules
			
			// ALWAYS USE PARENTHESIS for READABILITY. Not everyone is aware of precedence rules
			
			// 4. Use && to avoid NullPointerException
			//Student s1 = new Student(1001, "Raj");
			//update(s1, "Dheeru");
		}
		
		
		static void bitwiseOperators() {
		    System.out.println("\nInside bitwiseOperators ...");
		    int x = 1;
			int y = 3;
			
			System.out.println("x & y: " + (x & y));
			System.out.println("x | y: " + (x | y));
			System.out.println("x ^ y: " + (x ^ y));
			System.out.println("~x: " + (~x));
			System.out.println("true & false: " + (true & false));
			 
			char c1 = 'a'; // U+0061 --> 0110 0001
			char c2 = 'b'; // U+0062 --> 0110 0010
			System.out.println("c1 | c2: " + (c1 | c2)); // 0110 0011 --> 99 in decimal		
			
			// Since bitwise work only on Integer types, following will not compile
			//double d1 = 3.14;
			//double d2 = 5.15;
			//System.out.println("d1 | d2: " + (d1 | d2));
	    }
		
		static boolean ifStatement() {
			boolean approved = false;
			
			int age = 27;
			int salary = 60000;
			boolean hasBadCredit = false;
			
			if (age >= 25 && age <= 35 && salary >= 50000) {		
				approved = true;            			
				System.out.println("age >= 25 && age <= 35 && salary >= 50000");
			} else if (age > 35 && age <= 45 && salary >= 70000) {
				approved = true;			
				System.out.println("age > 35 && age <= 45 && salary >= 70000");
			} else if (age > 45 && age <= 55 && salary >= 90000) {
				approved = true;			
				System.out.println("age > 45 && age <= 55 && salary >= 90000");
			} else {
			    if (age > 55 && !hasBadCredit) {
					approved = true;			
					System.out.println("age > 55 && !hasBadCredit");
				}
				System.out.println("else block");
			}
			
					
			System.out.println("outside if");
			return approved;
		}
	  
		
	    static void switchExample() {
		    System.out.println("\nInside switchExample ...");
		    
		    byte month = 3;
		    switch (month) {
			    case 1: System.out.println("January");
		                break;
			    case 2: System.out.println("February");
		                break;
		        case 3: System.out.println("March");
		                break;
			    default: System.out.println("April");
		    }
	    }  
	   
	      
	    static void labeledBreak() {
		    System.out.println("\nInside labeledBreak ...");
		    int num = 0;
		    
		    outermost: for (int i = 0; i < 10; i++) {
		        for (int j = 0; j < 10; j++) {    
		            if (i == 5 && j == 5) {
		                break outermost;
		            }
		            num++;
		        }
		    }
			
		    System.out.println("num: " + num); // prints 55		
	    }
		
		static void labeledContinue() {
		    System.out.println("\nInside labeledContinue ...");
		    int num = 0;
			
		    outermost: for (int i = 0; i < 10; i++) {
		        for (int j = 0; j < 10; j++) {    
		            if (i == 5 && j == 5) {
		                continue outermost;
		            }
		            num++;
		        }
		    }
			
		    System.out.println("num: " + num); // prints 95
	    }
		
		static void stringExamples() {
			System.out.println("\nInside stringExamples ...");
			String s = "hello world!";
			System.out.println("s: " + s);
			
			System.out.println("\ns.length(): " + s.length());
			System.out.println("s.isEmpty(): " + s.isEmpty());
			
			// Comparison
			System.out.println("\ns.equals(\"HELLO WORLD!\"): " + s.equals("HELLO WORLD!"));
			System.out.println("s.equalsIgnoreCase(\"HELLO WORLD!\"): " + s.equalsIgnoreCase("HELLO WORLD!"));
			System.out.println("s.compareTo(\"HELLO WORLD!\"): " + s.compareTo("HELLO WORLD!"));
			
			// Searching
			System.out.println("\ns.contains(\"HELLO WORLD!\"): " + s.contains("HELLO WORLD!"));
			System.out.println("s.contains(\"world!\"): " + s.contains("world!"));
			System.out.println("s.startsWith(\"HELLO WORLD!\"): " + s.startsWith("HELLO WORLD!"));
			System.out.println("s.startsWith(\"hello world!\"): " + s.startsWith("hello world!"));
			System.out.println("s.endsWith(\"!\"): " + s.endsWith("!"));
			System.out.println("s.indexOf(\"lo\"): " + s.indexOf("lo"));
			System.out.println("s.indexOf(\"o\"): " + s.indexOf('o'));
			System.out.println("s.lastIndexOf(\"o\"): " + s.lastIndexOf('o'));
			
			// Examining individual characters
			System.out.println("\ns.charAt(4): " + s.charAt(4));
			
			// Extracting substrings
			System.out.println("\ns.substring(4): " + s.substring(4));
			System.out.println("s.substring(4, 9): " + s.substring(4, 9));
			
			// Case conversions (Note: String is immutable. So, only a copy is returned)
			System.out.println("\ns.toUpperCase(): " + s.toUpperCase());
			System.out.println("s.toLowerCase(): " + s.toLowerCase());
			
			System.out.println("\ns.trim(): " + s.trim()); // returns a copy of string after trimming any leading & trailing white spaces
			
			
			// Replace (e.g., replace comma's with white-space)
			System.out.println("\ns.replaceAll(\"o\", \"r\"): " + s.replaceAll("o", "r"));
			
			// Split (e.g., split a document into words or split a line of text by tab or comma or white space)
			System.out.println("\ns.split(\"o\"): ");
			String[] sa = s.split("o");
			for (String temp : sa) {
				System.out.println(temp);
			}
			
			// Static method (includes overloaded methods)
			System.out.println("\nString.valueOf(1.3): " + String.valueOf(1.3));
		}
		
		static void stringPool() {
		  System.out.println("\nInside stringPool ...");
		  String s1 = "hello!";
		  String s2 = "hello!";
		  String s3 = "hello!".intern();
		  String s4 = new String("hello!");	 
		  String s5 = "lo!";
		  	  
	      System.out.println("s1 == s2: " + (s1 == s2));
	      System.out.println("s1 == s3: " + (s1 == s3));
	      System.out.println("s1 == s4: " + (s1 == s4));
	      System.out.println("s1 == s4.intern(): " + (s1 == s4.intern()));
	      System.out.println("s1 == \"hel\" + \"lo!\": " + (s1 == "hel" + "lo!"));
	      System.out.println("s1 == \"hel\" + s5: " + (s1 == "hel" + s5)); 
	      
	    }

			
		private static void mathDemo() {
			// Lottery [1, 100]
			double random = Math.random(); // [0.0, 1.0)
			int winner = (int) (random * 100) + 1;
			
			System.out.println(random);
			System.out.println(winner);
			
			// round ~ rounding floating point to nearest integers
			long distance1 = Math.round(24.45);
			int distance2 = Math.round(24.5f);
			
			System.out.println(distance1);
			System.out.println(distance2);
			
			// ceil ~ round-up
			double ceil1 = Math.ceil(24.45);
			double ceil2 = Math.ceil(25.0);
			
			System.out.println(ceil1);
			System.out.println(ceil2);
			
			// floor ~ round down
			double floor1 = Math.floor(24.45);
			double floor2 = Math.floor(25.0);
			
			System.out.println(floor1);
			System.out.println(floor2);
			
			double max = Math.max(24.45, 24.5);
			System.out.println(max);
			
			double abs = Math.abs(-24.45);
			System.out.println(abs);
			
			double pow = Math.pow(2.0, 4.0);
			System.out.println(pow);
			
			double nan = 0.0/0.0;
			double sqrt = Math.sqrt(nan);
			System.out.println(nan);
			// Intro to Machine learning ~ "deep learning"
			double idf = Math.log(100/8);
			System.out.println(idf);
			
			//Math math = new Math();
		}
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 // Language Basics 1
			  //print();				
			  //primitives();
			  //System.out.println(emoji);
					
			  //booleanDemo();
			  //typeCasting();
			  //arrays();	
		      //threeDimensionalArrays();	
			 /* varargsOverload(true, 1, 2, 3);
		      varargsOverload(true, 1, 2, 3, 4, 5, 6, 7, 8);
			  varargsOverload(true);*/
			  
			  //preAndPost();
			  //compoundArithmeticAssignment();
			  //isOddOrEven(51);
			  //charTypePromotion();	  
			  //comparisonOperators();
		      //logicalOperators();		
			  //bitwiseOperators();
				
			  //ifStatement();
			  
			  //switchExample();
			  //labeledBreak();
			  //labeledContinue();
		      // import demo
		      // package creation demo
		      //stringExamples();
			  //stringPool();	
			 // mathDemo();
BasicDemo bd = new BasicDemo();
			
		}
			
			
}	


