package ProgramasBasicos;
import java.util.Random;

public class rolandoDados {

	public static void main(String[] args) {

		Random numeroDado = new Random();
		
		//dados n�o possuem 0, por isso adiciona mais 1
		int x = numeroDado.nextInt(6)+1;
		
		System.out.println(x);

	}

}
