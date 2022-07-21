package StringComparison;

public class ComparacaoString {
	public static void main(String[] args) {

		String a = new String("LEMur");
		String b = new String("Lemur");
		
		if(a.equals(b)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		String minuscula = a.toLowerCase();
		System.out.println(minuscula);
		
	}

}
