package abstractionInterfaceBasics;

public class Dog extends Animal {

	// Overriding the makeSound method
	@Override
	void makeSound() {
		System.out.println("The dog is barking: Woof! Woof!");
	}

}
