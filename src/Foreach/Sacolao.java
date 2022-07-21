package Foreach;

public class Sacolao {
	
	private String fruta;
	private String validade;
	private double kg;
	
	public Sacolao() {
		super();
	}

	

	public Sacolao(String fruta, String validade, double kg) {
		super();
		this.fruta = fruta;
		this.validade = validade;
		this.kg = kg;
	}



	public String getFruta() {
		return fruta;
	}



	public void setFruta(String fruta) {
		this.fruta = fruta;
	}



	public String getValidade() {
		return validade;
	}



	public void setValidade(String validade) {
		this.validade = validade;
	}



	public double getKg() {
		return kg;
	}



	public void setKg(double kg) {
		this.kg = kg;
	}



	@Override
	public String toString() {
		return "Fruta: " + this.fruta;
	}
	
	

}
