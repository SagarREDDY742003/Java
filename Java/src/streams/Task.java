package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task {

	public static void main(String[] args) {
		/////1///////
		ArrayList<Integer> arrlst = new ArrayList<>(Arrays.asList(2,7,6,8,4,3,9));
		ArrayList<Integer> newArrlst = (ArrayList<Integer>) arrlst.stream().map(s->s*s).collect(Collectors.toList());
		System.out.println(newArrlst);
		
		///////2////////
		ArrayList<String> arrlst1 = new ArrayList<>(Arrays.asList("sagar","Sai Hari","dhinesh"));
		ArrayList<String> newArrlst1 = (ArrayList<String>) arrlst1.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(newArrlst1);
		
		///////3////////////
		List<Employee> emp = Arrays.asList(
				new Employee(1,"sagar","developer"),
				new Employee(2,"dhinesh","tester"),
				new Employee(3,"sai hari","designer")
				);
		List<String> newlst2 = (List<String>) emp.stream().map(s->s.getName()).collect(Collectors.toList());
		System.out.println(newlst2);
		
	}

}
