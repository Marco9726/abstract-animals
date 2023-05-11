package animals;

import abs.Animal;
import inter.Swim;

public class Dolphin extends Animal implements Swim{

	@Override
	public void makeSwim() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getCry() {
		
		System.out.println("DolphinCry");
	}

	@Override
	public void getFood() {
		
		System.out.println("Fish");
	}

	

		
}