package ioStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JavaIOStreamExample {

	public static void main(String[] args) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("Sample.txt"));
			BufferedReader br = new BufferedReader(new FileReader("Sample.txt"));
			bw.write("Hello ");
			bw.write("Every One \n");
			bw.write("How are you.");
			bw.close();
			String content;
			while((content = br.readLine())!=null) {
				System.out.println(content);
			}
			br.close();
			System.out.println("Completed");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
