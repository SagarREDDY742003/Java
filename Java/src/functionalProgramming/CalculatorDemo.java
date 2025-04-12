package functionalProgramming;

public class CalculatorDemo {

	public static void main(String[] args) {
		
		Calculator addition = (a,b) -> a+b;
		Calculator subtraction = (a,b) -> a-b;
		Calculator multiplication = (a,b) -> a*b;
		Calculator division = (a,b) -> a/b;
		
		System.out.println(addition.calculate(1,5));
		System.out.println(subtraction.calculate(5, 9));
		System.out.println(multiplication.calculate(2, 10));
		System.out.println(division.calculate(5, 2));
	}

}
