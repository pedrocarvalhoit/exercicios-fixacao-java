package HashMap;
import java.util.HashMap;

public class HashMapTutorial {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> happy = new HashMap<String, Integer>();
		happy.put("a", 10);
		happy.put("b", 3);
		happy.put("c", 88);
		
		System.out.println(happy);
		System.out.println(happy.get("c"));
		
		HashMap<String, String> fun = new HashMap<String, String>();
		fun.put("Pedro1996", "1234");
		fun.put("Thamires", "3214");
		fun.put("Victor", "2214");
		
		System.out.println(fun);
		System.out.println(fun.keySet());
		System.out.println(fun.entrySet());
		
		
		
		
	}

}
