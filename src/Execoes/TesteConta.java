package Execoes;

public class TesteConta {
	
	public static void main(String[] args) {
		
		Conta pedro = new Conta(500, "pedro", 600, 900);
		pedro.withdraw(605);
		System.out.println(pedro.getBalance());
		
		
	}

}
