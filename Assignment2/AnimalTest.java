
public class AnimalTest {

	public static void main(String[] args) {

		//create an instance of each class
		String dogName = "Pluto";
		Dog dog = new Dog(dogName);
		dog.setType("Hound");
		dog.setAge(3);
		dog.setEnvironment("Home");
		dog.setGender("male");
		dog.setMovement("15 mph");
		
		String catName = "Tom";
		Cat cat = new Cat(catName);
		cat.setType("Tabby");
		cat.setAge(6);
		cat.setEnvironment("Home");
		cat.setGender("male");
		cat.setMovement("22 mph");
		
		String raccoonName = "Scrap";
		Raccoon raccoon = new Raccoon(raccoonName);
		raccoon.setType("Raccoon");
		raccoon.setAge(2);
		raccoon.setEnvironment("Forest");
		raccoon.setGender("female");
		raccoon.setMovement("10 mph");
		
		String whaleName = "Moby";
		Whale whale = new Whale(whaleName);
		whale.setType("Blue Whale");
		whale.setAge(69);
		whale.setEnvironment("Ocean");
		whale.setGender("male");
		whale.setMovement("20 mph");
		
		//print out every method from each class
		System.out.println(dog.toString());
		dog.move();
		dog.sound();
		dog.eat();
		dog.sleep();
		dog.walk();
		dog.greetHuman();
		dog.bark();
		System.out.println();
		System.out.println(cat.toString());
		cat.move();
		cat.sound();
		cat.eat();
		cat.sleep();
		cat.walk();
		cat.greetHuman();
		cat.scratch();
		System.out.println();
		System.out.println(raccoon.toString());
		raccoon.move();
		raccoon.sound();
		raccoon.eat();
		raccoon.sleep();
		raccoon.scratch();
		System.out.println();
		System.out.println(whale.toString());
		whale.move();
		whale.sound();
		whale.eat();
		whale.sleep();
		whale.swim();
	}

}
