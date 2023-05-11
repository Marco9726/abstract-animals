package animals;

import abs.Animal;

public class Dog extends Animal {

	@Override
	public void getCry() {
		
		System.out.println("Bau");
	}

	@Override
	public void getFood() {
		
		System.out.println("Meat");
	}
	
}
