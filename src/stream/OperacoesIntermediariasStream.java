package stream;

import java.util.Arrays;
import java.util.List;

public class OperacoesIntermediariasStream {

	public static void main(String[] args) {

		List<Integer> lista = Arrays.asList(1,4,5,12,5,5,2,3,5,6);
		
		lista.stream()
			//.skip(2) pula os dois primeiros
			//.limit(3) limita a apenas os 2 primeiro numeros
			.distinct() //limita os iguais e imprime apenas 1
			.forEach(s -> System.out.println(s));

		lista.stream()
			.filter(e -> e % 2 == 0) // filtra os pares
			.forEach(e -> System.out.println(e));
		
		lista.stream()
			.map(e -> e * 2)
			.forEach(e -> System.out.println(e));
		
	}

}
