package animals;

import abs.Animal;
import inter.Fly;

public class Bird extends Animal implements Fly{

	@Override
	public void makeFly() {
		
		System.out.println();
	}

	@Override
	public void getCry() {
		
		System.out.println("Chip");
	}

	@Override
	public void getFood() {
		
		System.out.println("BirdFood");
	}	
		
}