package JavaDS_and_algo;
import java.util.Arrays;
public class MyArray {

	private String [] array;
	private int capacity;
	private int currentLength;
	MyArray(){
		array = new String[1];
		capacity = 1;
		currentLength = 0;
	}
	
	public  String get(int index) {
//get method will return the elements of the given index		
		if (index> -1 && index<currentLength) 
			
			return this.array[index];
		
		else return "index out of bound";	
	}
	public void push(String item) {
//push method add the elements at the end 
// if currentlength is equal to capacity then
//we need to increase the capacity of the array to add new elements
		if (currentLength == capacity) {
			 String [] tempArray = new String[2*capacity];
			 // create a new array with double capacity
			 //copy the old array to the new array
			 for(int i =0;i<array.length;i++) {
				 tempArray[i]=array[i];
			 }
	    // set the newly created array as our real array.
			 array = tempArray;
			 // update the value of the capacity
			 capacity = capacity*2;
		}
		// insert the new element at the end
		array[currentLength] = item;
		currentLength++;
		
	}
	public void replace(int index,String item) {
		if(index>-1&& index<currentLength) {
		array[index]=item;
	}
		else 
			System.out.println("index out of bound sorry !");
	}
	
	public void pop() {
		//remove last element
		if(currentLength>0) {
			currentLength--;
		}
	}
	
	public void delete(int index) {
		// delete the elements at the given index
		if(index>-1&&index<currentLength) {
			if(index == currentLength-1) {
				pop();
			}
			else
				for(int i = index;i<currentLength;i++) {
					array[i]=array[i+1];
				}
			currentLength--;
		}else
			System.out.println("index out of bound");
	}
	public String[] getArray() {
		
		String [] tempArr = new String[currentLength];
		for(int i = 0; i<currentLength;i++) {
			tempArr[i]=array[i];
		}
		return tempArr; 
	}
	public int length() {
		return currentLength;
	}
	public static void main(String[] args) {

		MyArray myarr = new MyArray();
		myarr.push("banana");
		myarr.push("mango");
		myarr.push("papaya");
		myarr.push("strawbwerry");
	}

}
