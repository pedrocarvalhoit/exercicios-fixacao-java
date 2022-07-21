package Colecoes;

import java.util.HashMap;
import java.util.Map;

public class ColecoesMap {
	
	//Map<Key,Valor>
	//HashMap: acesso r�pido mas n�o mant�m a ordem
	//treemap
	//linkedHashMap

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		map.put("user", "maria");
		map.put("phone", "123123123");
		
		for(String key : map.keySet()) {
			System.out.println("Chave = " + key + ", Valor = " + map.get(key));
		}
		
		
		
	}
}
