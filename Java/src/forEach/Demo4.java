package forEach;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo4 {

	public static void main(String[] args) {
		ArrayList<Integer> arrlst = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		arrlst.forEach(number -> System.out.println(number));
		arrlst.forEach(System.out::print);	
	}

}
