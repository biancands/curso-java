package implementarDiagramas;

public class Miseravel extends Pessoa {
	
	private double trocado = 0;

	public Miseravel(String nome, int idade) {
		super(nome, idade);
		System.out.println(nome+", "+idade+" anos");
	}
	
	public void mendiga(double trocado) {
		this.trocado += trocado;
	}
	
	public double getTrocado() {
		return trocado;
	}

}
