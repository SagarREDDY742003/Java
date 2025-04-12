package streams;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo2 {

	public static void main(String[] args) {
		ArrayList<Integer> salary = new ArrayList<>(Arrays.asList(23,25,130,40,15,60));
		
		System.out.println(salary.stream().filter(s->s<25).count());
		System.out.println(salary.stream().filter(s->s>25).count());
		salary.stream().filter(s->s<25).map(s->s*2).forEach(System.out::println);

	}

}
