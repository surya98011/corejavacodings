package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		File file = new File("myfile.txt");
		
		Scanner input;
		
			input = new Scanner(file);
		
		while(input.hasNextLine()) {
			String line = input.nextLine();
			System.out.println(line);
		}
		input.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("we have not found any file");
		}
		
		MyFileHandle myfile =   new MyFileHandle();
		try {
			System.out.println(myfile.substract20WithNumber(25));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
