package animals;

import abs.Animal;

public class Bird extends Animal{

	public Bird(String cry, String food) {
		
		super(cry, food);
	
	}

	@Override
	protected void showCry() {
		
		System.out.println(getCry());
	}

	@Override
	protected void showFood() {
		
		System.out.println(getFood());
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
		
}