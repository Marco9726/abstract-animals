package animals;

import abs.Animal;
import inter.Fly;

public class Eagle extends Animal implements Fly{

	@Override
	public void makeFly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getCry() {
		
		System.out.println("EagleCry");
	}

	@Override
	public void getFood() {
		
		System.out.println("EagleFood");
	}

		
}
