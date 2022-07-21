package trycatch;

import java.util.Scanner;

public class Exemplo2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu número favorito.");
		
		try {
			
		int n = scan.nextInt();
		System.out.println(n);
		
		}catch (Exception e) {
			System.out.println("Tente novamente com um número.");
		}
		
	}

}
