package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
////time stamp,epoch
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrlst = new ArrayList<>(Arrays.asList(1,2,13,4,5,6));
		Stream<Integer> str = arrlst.stream();
		str.forEach(System.out::println);
		
		////////filter///////////////
		System.out.println("//////FILTER////////");
		Stream<Integer> str1 = arrlst.stream();
		Stream<Integer> strFilter=str1.filter(s->s>5);
		strFilter.forEach(System.out::println);
		System.out.println("Single Line");
		arrlst.stream().filter(s->s>5).forEach(System.out::println);
		
		////////map/////////////
		System.out.println("//////MAP////////");
		Stream<Integer> str2 = arrlst.stream();
		Stream<Integer> strMap=str2.map(s->s*10);
		strMap.forEach(System.out::println);
		System.out.println("Single Line");
		arrlst.stream().map(s->s*10).forEach(System.out::println);
		
		////////sorted/////////
		System.out.println("//////SORTED////////");
		Stream<Integer> str3 = arrlst.stream();
		Stream<Integer> strSorted=str3.sorted();
		strSorted.forEach(System.out::println);
		System.out.println("Single Line");
		arrlst.stream().sorted().forEach(System.out::println);
		
		////////collector//////////////////
		System.out.println("//////SORTED////////");
		ArrayList<Integer> arr = (ArrayList<Integer>) arrlst.stream().filter(s->s<6).map(s->s*2).collect(Collectors.toList());
		System.out.println(arr);
		
		////////REDUCE//////////////////
		System.out.println("//////reduce////////");
		System.out.println(arrlst.stream().reduce(0,(sum,current)->sum+current));
		
		
	}

}
