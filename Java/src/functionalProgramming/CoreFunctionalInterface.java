package functionalProgramming;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class CoreFunctionalInterface {
	public static void main(String[] args) {
		Supplier<String> supplier = () -> "Welcome";//returns value
		System.out.println(supplier.get());
		
		Consumer<String> consumer = t -> System.out.println(t+" eat here");//take value and doesnt written anything
		consumer.accept("Balaya");
		
		Function<String, Integer> perfornAction = t-> t.length();//similar to method
		System.out.println(perfornAction.apply("London"));
		
		Predicate<Long> sayTrueOrFalse = (t) -> t>50; //used in streams //takes parameter and return boolean value
		System.out.println(sayTrueOrFalse.test(66l));
		
		IntPredicate sayTrueOrFalse1 = (t) -> t>50; //
		System.out.println(sayTrueOrFalse1.test(500));
	}
}
