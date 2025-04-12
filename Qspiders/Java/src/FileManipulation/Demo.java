package FileManipulation;

import java.io.File;
import java.io.IOException;


public class Demo {

	public static void main(String[] args){
		File f1 = new File("file1.txt");
		try {
			f1.createNewFile();
		} 
		catch (IOException e) {
			System.out.println("File Already Exis");
		}

			

	}

}

