package ApenasTestes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Teste2 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner documento = new Scanner(new File("documento.txt"));
		while(documento.hasNextLine()) {
			String linha = documento.nextLine();
			System.out.println(linha);
		
		}
		
	}
}
