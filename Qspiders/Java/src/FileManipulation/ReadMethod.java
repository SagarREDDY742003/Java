package FileManipulation;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadMethod {

	public static void main(String[] args) throws IOException {
		System.out.println("START");
		File f = new File("TestFile.txt");
		FileReader fw = new FileReader(f);
		int ch = fw.read();
		while(ch!=-1) {
			System.out.print((char)ch);
			ch=fw.read();
		}
		System.out.println(" END");
		fw.close();
	}

}
