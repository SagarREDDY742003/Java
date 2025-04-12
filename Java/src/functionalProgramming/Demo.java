package functionalProgramming;

public class Demo {
	
	public static void main(String[] args) {
		ParentClass pc = new ParentClass();
		pc.print();
		ParentClass pc1 = new ParentClass() {
			@Override
			public void print() {
				System.out.println("Message from override print method");
			}
		};
		pc1.print();
		
		
		ParentInterface pi = new ParentInterface() {
			
			@Override
			public void printing(String name) {
				System.out.println("Message from override printing method: "+name);
				
			}
		};
		pi.printing("Sagar");
	}
}
