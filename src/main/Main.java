package main;

import abs.Animal;
import animals.Bird;
import animals.Dog;
import animals.Dolphin;
import animals.Eagle;

public class Main {
	
	public static void main(String[] args) {
		
		Dog d1 = new Dog();	
		Bird b1 = new Bird();
		Eagle e1 = new Eagle();
		Dolphin do1 = new Dolphin();
		
		Animal[] animals = { d1, b1, e1, do1 };
		
		for ( int i = 0; i < animals.length; i++) {
			
			animals[i].getCry();
			System.out.println("-----------");
		}
		
		
	}
}
