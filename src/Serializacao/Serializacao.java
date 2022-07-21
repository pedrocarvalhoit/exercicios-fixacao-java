package Serializacao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Serializacao {

	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("documento.txt");
		Scanner scan = new Scanner(file);
		
		
		
		while(scan.nextLine() != null){
			System.out.println(scan.nextLine());
		}

	}

}
