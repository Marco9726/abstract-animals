package abs;

public abstract class Animal {
	
	private String cry;
	private String food;
	
	public Animal( String cry, String food) {
		
		setCry(cry);
		setFood(food);
	}
		
	public String getCry() {
		return cry;
	}

	public void setCry(String cry) {
		this.cry = cry;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}
	
	public static void sleep() {
		
		System.out.println("Zzz");
	}
	
	protected abstract void showCry();
	
	protected abstract void showFood();

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getCry() + "\n" + getFood();
	}
	
}
