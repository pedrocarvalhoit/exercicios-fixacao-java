package ListaLikedLista;

import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ListaLikedList {
	
	public static void main(String[] args) {
		
		LinkedList<String> link = new LinkedList<String>();
		
		link.add("Rob");
		link.add("Pedro");
		link.add("jose");
		
		link.get(2);
		
		System.out.println(link.get(2));
		
		LinkedList<Integer> listaInt = new LinkedList<Integer>();
		
		listaInt.add(3);
		
		ArrayList<String> loja = new ArrayList<String>();
		loja.add("Palio");
		System.out.println(loja.get(0));
		loja.add("Fusca");
		System.out.println(loja.size());
		System.out.println(loja);
		
		
	}

}
