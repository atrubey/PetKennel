import java.util.List;

public class Kennel {
	private List<Pet> petList;

	public Kennel(List<Pet> list) {
		petList = list;
	}

	/**
	 * For every Pet in the kennel, print the name followed by the result of a call
	 * to its speak method, one line per Pet
	 */
	public void allSpeak() {
		for (Pet a : petList) {
			System.out.println(a.getName() + " " + a.speak());
		}
	}

}
