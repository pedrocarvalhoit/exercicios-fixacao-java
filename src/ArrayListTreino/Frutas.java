package ArrayListTreino;

public class Frutas {

	private String nome;
	private String dataColheita;
	private String origem;
	private int pre�o;
	
	public Frutas(String nome, String dataColheita, String origem, int pre�o) {
		this.nome = nome;
		this.dataColheita = dataColheita;
		this.origem = origem;
		this.pre�o = pre�o;
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

	public int getPre�o() {
		return pre�o;
	}

	public void setPre�o(int pre�o) {
		this.pre�o = pre�o;
	}

	@Override
	public String toString() {
		return "Fruta: " + nome + " ,colhida em: " + origem;
	}
	
	
}
