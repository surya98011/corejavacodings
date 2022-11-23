package filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {
    
		try {
			FileReader filereader =  new FileReader("myfile.txt");
			BufferedReader bfreader = new BufferedReader(filereader);
			
			String line = bfreader.readLine();
			while(line != null) {
				System.out.println(line);
				line = bfreader.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("file not found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("processed but able to read the file");
		}
	// to close the resources we used to use finally before 
		// jdk 1.7 and after 1.7 we can use the try with resorses as well
//		finally {
//			bfreader.close();
//			filereader.close();
//		}
//		
	}
    
}   
