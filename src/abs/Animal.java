package abs;

public abstract class Animal {
	
	public static void sleep() {
		
		System.out.println("Zzz");
	}
	
	public abstract void getCry();
	
	public abstract void getFood();
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}
