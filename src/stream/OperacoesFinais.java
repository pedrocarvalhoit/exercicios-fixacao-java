package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OperacoesFinais {
	public static void main(String[] args) {
		
	List<Integer> lista = Arrays.asList(1,4,5,12,5,5,2,3,5,6);
	
	long count = lista.stream()
			.map(e -> e * 2)// multiplica por 2 mas nao altera o original
			.count(); //Conta o total na lista
	
	System.out.println(count);
	
	Optional<Integer> max =	lista.stream()
		.filter(e -> e % 2 == 0)
		.max(Comparator.naturalOrder());
	
	System.out.println(max.get());
	
	String collect = lista.stream()
			.map(e -> String.valueOf(e)) //transformando o array em string
			.collect(Collectors.joining("-")); // separando os valores pra print
	
	System.out.println(collect);
	
	}
}
