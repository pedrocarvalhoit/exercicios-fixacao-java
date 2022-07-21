package Foreach;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TesteForEach extends Sacolao{

	public static void main(String[] args) {
		
		List<Sacolao> janeiro = new LinkedList();
		
		Sacolao laranja = new Sacolao("Laranja", "Outubro", 146);
		janeiro.add(laranja);
		
		Sacolao limao = new Sacolao("Limao", "Outubro", 146);
		janeiro.add(limao);
		
		Sacolao abacaxi = new Sacolao("Abacaxi", "Outubro", 146);
		janeiro.add(abacaxi);
		
		Sacolao uva = new Sacolao("Uva", "Outubro", 146);
		janeiro.add(uva);
		
		for (Object b  : janeiro) {
			System.out.println(b);
		}
		
		System.out.println("--------");
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(3);
		numeros.add(34);
		numeros.add(33);
		numeros.add(12345);
		
		for (int a : numeros) {
			System.out.println(a);
		}
		
		
		
	}
	
}
