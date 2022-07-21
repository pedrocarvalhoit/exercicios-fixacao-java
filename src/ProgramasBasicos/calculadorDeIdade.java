package ProgramasBasicos;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class calculadorDeIdade {
	
	public static void main(String[] args) {
		
		LocalDate dataAtual =  LocalDate.now();
		LocalDate dataAniversario = LocalDate.of(1992, 8, 25);
		
		//tempo completo
		Period periodo = Period.between(dataAtual, dataAniversario);
		System.out.println(periodo );
			
		//apenas anos
		int idade = Period.between(dataAtual, dataAniversario).getYears();
		System.out.println( idade + " Anos.");
		
	}

}
