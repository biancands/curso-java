package implementarDiagramas;

public abstract class Animal {
	
	private String nome;
	private String raca;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getRaca() {
		return raca;
	}
	
	public void caminha(String caminha) {}
	
	

}
