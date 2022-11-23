package JavaDS_and_algo;

public class Linear_BIG_0 {
	
	public static boolean isContainsCommon(String [] arr1,String [] arr2) {
		
		for(int i =0;i<arr1.length;i++) {
			for(int j = 0;j<arr2.length;j++) {
				
				if(arr1[i]==arr2[j]) {
					
					return true;
				}
			}
		}
		
		return false;
	}

	public static void findSurya(String [] name) {
		
		for(int i =0;i<name.length;i++) {
			System.out.println("running");
			if(name[i]=="surya") {
				
				System.out.println("found surya at : "+i+"th index");
				
				break; // in terms of scalablity if we find surya at index 1
				// at 2 , 3 or 4 with the break keyword we are not going to 
				//loop through the end so this the best case 
			}
			
		}
	}
	
	public static void firstCompress(String [] boxes) {
		
		for(int i =0;i<boxes.length;i++) {
			//this function takes constant time for operation
			// no matter what the size of the boxes
			//O(n)-->O(1)--> constant time
			System.out.println(boxes[1]);
			break;
		}
	}
	
	public static void printTwoLastNo(String [] boxes) {
		
		for(int i =0;i<boxes.length;i++) {
			
			System.out.println(boxes[0]);//O(1)
			System.out.println(boxes[1]);//O(1)
			System.out.println(boxes[2]);//O(1)
			// over all no of operations-->O(3)
			// O(3) which is a fixed constant operation
			// we can write it as O(1)
			
		}
	}
	
	public static void main(String[] args) {
		
		String s = new String ("hello");
		String s1 = new String ("hello");
		//System.out.println(s.equals(s1));
		boolean x = s==s1;
		if(!x) {
			System.out.println(x);
			s="Hello";
		}
		else {
			System.out.println("its not true");
		}
		//		String [] array1= {"a","b","c","d"};
//		String [] array2 = {"x","y","z","s"};
//		
//		boolean x = isContainsCommon(array1,array2);
//		System.out.println(x);
//		String [] surya = new String[100];
//		surya[99]="surya";
//		surya[1]="surya";
//		String [] name = {"gangesh","papa","Chandan","surya"};
//		findSurya(surya);// o(n)-->O(100000)
		//---> O(n)--> linear operation
		//firstCompress(surya);
	}

}
