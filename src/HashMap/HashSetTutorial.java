package HashMap;

import java.util.HashSet;

public class HashSetTutorial {

	public static void main(String[] args) {

		HashSet<String> h = new HashSet<String>();
		h.add("Pedro");
		h.add("Thamires");
		
		h.forEach(letra ->{
			System.out.println(letra);
		});

	}

}
