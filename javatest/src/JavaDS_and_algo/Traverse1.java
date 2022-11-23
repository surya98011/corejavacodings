package JavaDS_and_algo;

public class Traverse1 {
// traversing from both ends 
	
	//reverse the elements of the array
	public static void reverse(int [] a) {
		int start = 0,end=a.length-1;
		while(start<end) {
			swap(a,start,end);
			start++;
			end--;
			
		}
		
	}
	public static void swap(int [] a, int i , int j) {
		int temp = a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] a= {5,6,7,8,9,10};
reverse(a);
System.out.println(a);

}}
