package FileManipulation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteMethod {
	public static void main(String[] args) {
		System.out.println("START");
		File f;
		FileWriter fw = null;
		try {
			f = new File("TestFile.txt");
			fw = new FileWriter(f);
			fw.write("Hello");
			fw.flush();
			fw.write("\nBye");
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("End");
		}	
	}
}