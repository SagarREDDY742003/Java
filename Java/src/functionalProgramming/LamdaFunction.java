package functionalProgramming;

public class LamdaFunction {
	public static void main(String[] args) {
		
		ParentInterface pi = (name) -> System.out.println("Hello "+name);
		ParentInterface pi1 = name -> name.length();

		pi.printing("Sagar");
		pi1.printing("reddy");
	}
}
