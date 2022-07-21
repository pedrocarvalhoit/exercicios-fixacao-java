package ProgramasBasicos;


public class StringReversa{
	String frase;
		public StringReversa(String frase) {
		this.frase = frase;
	}

	public String getFrase() {
			return frase;
		}

	public static void main(String[] args) {
			
		StringReversa str = new StringReversa("Minha String");
		StringBuilder strContrario = new StringBuilder(str.getFrase());
		System.out.println(strContrario.reverse());
		
		//Sem utilização de métodos prontos
		
		String reversao = reverse("dog");
		System.out.println(reversao);		 
		
	}

	public static String reverse(String s) {
		char[] letras = new char[s.length()];
		
		int letrasArray = 0;
		for(int i = s.length()-1;  i >= 0;  i--) {
			letras[letrasArray] = s.charAt(i);
			letrasArray++;	
		}
		
		String reverse ="";
		for(int i = 0; i < s.length(); i++) {
			reverse = reverse + letras[i];
		}
		return reverse;
	}
	
}
