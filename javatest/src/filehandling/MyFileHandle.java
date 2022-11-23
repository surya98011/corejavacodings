package filehandling;

import com.surya.myownexception.BabyRunTimeException;

public class MyFileHandle {

	public int substract20WithNumber(int number)  throws BabyRunTimeException{
		if(number<20) {
			throw new BabyRunTimeException("Number is less than 20");
		}
		return number-20;
		
			
		
	}
}
