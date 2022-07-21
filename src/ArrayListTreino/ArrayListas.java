package ArrayListTreino;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListas extends Frutas {
	
	
	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
		
	String[] frutaria = new String[5];
	frutaria[0] = "Banana";
	frutaria[1] = "Laranja";
	//System.out.println(frutaria[1]);
	
	ArrayList<Frutas> pomar = new ArrayList<Frutas>();
	
	Frutas banana = new Frutas();
	banana.setNome("Banana");
	banana.setOrigem("África");
	pomar.add(banana);
	
	Frutas laranja = new Frutas("Laranja", "22/05/2022", "Algarve", 65);
	pomar.add(laranja);
	
	//System.out.println(pomar.get(0));
	//System.out.println(pomar.size());
	
	//System.out.println(pomar.get(1));
	
	Frutas limao = new Frutas();
	pomar.add(limao);
	limao.setNome("Limão");
	limao.setDataColheita("dezembro");
	limao.setPreço(56);
	limao.setOrigem("Mesquita");
	
	//System.out.println(pomar.get(2));
	
	for(int i = 0; i < pomar.size(); i++) {
		System.out.println(pomar.get(i));
	}
	
/*	System.out.println("Escolha qual fruta deseja acessar: ");
	String escolhaFruta = scan.next();
	
	if(escolhaFruta.equalsIgnoreCase("Laranja")) {
		System.out.println(laranja);
	}else if (escolhaFruta.equalsIgnoreCase("limão")) {
		System.out.println(limao);
	}else if (escolhaFruta.equalsIgnoreCase("Banana")) {
		System.out.println(banana);
	}else {
		System.out.println("Tente novamente: ");
	}*/
	
	System.out.println("Consulte uma fruta no pomar, digite em miúsculo");
	String consulta = scan.next();
	boolean existe = pomar.contains(consulta);
	System.out.println(existe);
	
	
	
	
	
	
	
	
	
	}
}
