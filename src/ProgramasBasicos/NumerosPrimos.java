package ProgramasBasicos;
import java.util.ArrayList;

public class NumerosPrimos {

	public static void main(String[] args) {
		
		System.out.println(acharPrimos(1, 100));
		
	}
	
	public static ArrayList<Integer> acharPrimos(int start, int end) {
		
		ArrayList<Integer> primos = new ArrayList<Integer>();
		
		for(int n = start; n < end; n++) {
			boolean primo = true;
			
			int i = 2; 
			while(i <= n/2) {
				if(n % i == 0) {
					primo = false;
					break;
				}
				i++;
			}
			
			if(primo) {
				primos.add(n);
			}
		}
		
		return primos;
	}

}