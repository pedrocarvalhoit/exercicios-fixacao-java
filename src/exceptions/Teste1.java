package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("Escolha um numero");
			int a = scan.nextInt();
			System.out.println(a);
		}catch (InputMismatchException e) {
			System.out.println("Por favor escolha um número");		
			
			
		}catch (Exception e) {
				System.out.println("Por favor tente novamente");		
			
			
				}
		
		
		
		
		
	}
	
}
