package main;

import abs.Animal;
import animals.Bird;
import animals.Dog;
import animals.Dolphin;
import animals.Eagle;

public class Main {
	
	public static void main(String[] args) {
		
		Dog d1 = new Dog("bau", "meat");	
		Bird b1 = new Bird("chip", "insects");
		Eagle e1 = new Eagle("cryEagle", "meat");
		Dolphin do1 = new Dolphin("cryDolphin", "fish");
		
		Animal[] animals = { d1, b1, e1, do1 };
		
		for ( int i = 0; i < animals.length; i++) {
			
			System.out.println(animals[i]);
			System.out.println("-----------");
		}
		
		
	}
}
