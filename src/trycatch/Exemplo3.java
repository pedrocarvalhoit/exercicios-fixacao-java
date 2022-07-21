package trycatch;

public class Exemplo3 {
	
	public static void main(String[] args) {
		
		try {		
		int[] a = null;
		System.out.println(a[2]);
		}catch(NullPointerException e) {
			System.out.println("Seu array está null");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array fora do limite");
		}catch(Exception e) {
			System.out.println("Alguma coisa está errado");
		}
		
		
		
	}

}
