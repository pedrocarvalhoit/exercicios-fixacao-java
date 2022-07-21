package trycatch;

import java.util.Scanner;

public class TryCatchExemples {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		try {
			int[] a = {1, 3, 4, 5, 6};
			System.out.println(a[5]);
		}catch(Exception e) {
			System.out.println("Digite o numero certo do array");
		}
		
		
		
		
	}
}
