
public class Cat extends Pet {
	private String cat_sound = "meow";

	public Cat(String petName) {
		super(petName);
	}

	public String speak() {
		return cat_sound;
	}
}
