package forEach;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		ArrayList<String> arrlst = new ArrayList<String>();
		arrlst.addAll(Arrays.asList("Puspha","Ghona Ghanna Reddy","Lucky","Bantu"));
		arrlst.forEach(name -> System.out.println("Welcome to 1000 club "+name));
	}

}
