		import java.util.ArrayList;
		import java.util.Collections;
public class Animals2 {

	public static void main(String[] args) {
		// sorting strings in an arraylist
		ArrayList insects = new ArrayList();
		insects.add("mosquito");
		insects.add("butterfly");
		insects.add("dragonfly");
		insects.add("fly");

		int size = insects.size();
		for (int i=0; i<size; i++) {
		  System.out.println("insect " + i + " : " + (String) insects.get(i));
		}
		System.out.println("\n");
		Collections.sort(insects);

		for (int i=0; i<size; i++) {
		  System.out.println("insect " + i + " : " + (String) insects.get(i));
		}
	}

}
