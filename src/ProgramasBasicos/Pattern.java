package ProgramasBasicos;


import java.util.Scanner;

public class Pattern {
	
	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Ecolha o tamanho do padrão desejado");
	int numEstrelas = scan.nextInt();
	
	for(int i = 1; i <= numEstrelas; i++) {
		for(int j = 0; j < i; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
		for(int i = numEstrelas - 1; i > 0; i--) {
			for(int j = 0; j < i;  j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
	
	}
}
