
public class ExcecaoLorraine {

	public static void main(String[] args) {

		int[] vetor = new int[4];
		
		System.out.println("Antes da execption.");
		
		try {
			vetor[4] = 1;
		}catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Tentou acessar um array que n�o existe ");
		}
		
		System.out.println("Esse texto n�o ser� impresso.");
		
	}

}
