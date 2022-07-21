package ApenasTestes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Encapsulamento {
	public class Funcionario{
	
		private String nome;
		private String cpf;
		private Cargo cargo;
		private double salario;
		
		
		public void reajusteSalario(double aumento) {
			double percentualReajuste = (salario / 100) * aumento;
			
			if(percentualReajuste > 40) {
				throw new IllegalArgumentException(
						"Percentual deve ser inferior a 40%");
			}
			this.salario += aumento;
		}
		
		
		
		}
	
	}


