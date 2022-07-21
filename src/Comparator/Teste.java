package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Teste {
	
	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<>();
		
		lista.add("Pedro");
		lista.add("Andre");
		lista.add("Thamires");
		lista.add("Joao");
		lista.add("Luisa");
		
		System.out.println("Antes de ordenar" + lista);
		
		Collections.sort(lista, new TesteComparator());
		
		
		
		
		System.out.println("Depois de ordenar" + lista);
		
		for (Object string : lista) {
			System.out.println(lista);
		}
		
	}

}
