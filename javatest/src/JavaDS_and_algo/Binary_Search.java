package JavaDS_and_algo;

public class Binary_Search {
	
	public static int binarySearch(int [] a, int target) {
		
		int start = 0;
		int end = a.length-1;
		
		while(start<=end) {
			int mid = start+(end-start)/2;
			if(a[mid]>target) {
				end=mid-1;
			}else if(a[mid]<target) {
				start=mid+1;
			}else {
				return mid;
			}
			
		}
		return -1;
		
	}

	public static int firstOccurance(int [] a,int target) {
		int start = 0;
		int end = a.length-1;
		
		while(start<=end) {
			int mid = start+(end-start)/2;
			if(a[mid]>target && a[mid]==target && a[mid]>0 && a[mid-1]==target) {
				end=mid-1;// additional condition is added for the first occurance finding
			}else if(a[mid]<target) {
				start=mid+1;
			}else {
				return mid;
			}
			
		}
		return -1;
		
	}

	public static int descendingBinarySearch(int [] array, int element) {
		
		int start = 0;
		int end = array.length-1;
	while(start<=end) {
		int mid = start + (end-start)/2;
		if(element==array[mid]) {
			return mid;
		}
		else if (element<array[mid]) {
			start=mid+1;
		}
		else {
			end = mid-1;
		}
		return mid;
	}
		
		
		
		return -1;
		
	}
	
	public static int orderAgnosticSearch(int[] array , int target) {
		
	        int start = 0;
	        int end = array.length-1;
	        while(start<=end){
	        int mid = start+(end-start)/2;
	        if(start==end && array[0]==target) return start;
	        if(array[0]<array[1]){ 
	            
	            if(target==array[mid]) return mid;
	            
	            else if(target<array[mid]){
	                end=mid-1;
	            }
	            
	        else{
	            start=mid+1;
	        }
	        if (array[0]>array[1]){
	             if(target==array[mid]) return mid;
	            
	            else if(target<array[mid]){
	                start=mid+1;
	            }
	            
	        else{
	            end=mid-1;
	        }
	        }
	            
	        }
	        
	        }
	        return -1;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target = 12;
	int [] array = {1,2,4,5,7,8,9,11,12,14};
	int x = binarySearch(array,target);
	System.out.println(x);

	}

}
