import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		LoudDog lDog1 = new LoudDog("Ivy");
		Cat cat1 = new Cat("Mittens");
		Dog dog1 = new Dog("Kira");

		ArrayList<Pet> petList = new ArrayList<Pet>();

		petList.add(lDog1);
		petList.add(dog1);
		petList.add(cat1);

		Kennel kennel1 = new Kennel(petList);

		kennel1.allSpeak();

	}

}
