package ArrayListTreino;

public class Frutas {

	private String nome;
	private String dataColheita;
	private String origem;
	private int preço;
	
	public Frutas(String nome, String dataColheita, String origem, int preço) {
		this.nome = nome;
		this.dataColheita = dataColheita;
		this.origem = origem;
		this.preço = preço;
	}
	
	public Frutas() {
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataColheita() {
		return dataColheita;
	}

	public void setDataColheita(String dataColheita) {
		this.dataColheita = dataColheita;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public int getPreço() {
		return preço;
	}

	public void setPreço(int preço) {
		this.preço = preço;
	}

	@Override
	public String toString() {
		return "Fruta: " + nome + " ,colhida em: " + origem;
	}
	
	
}
