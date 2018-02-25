
public class Dog extends Pet {
	private String dog_sound = "Bark";

	public Dog(String petName) {
		super(petName);
	}

	public String speak() {
		return dog_sound;
	}
}
