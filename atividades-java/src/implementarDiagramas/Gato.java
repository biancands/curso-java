package implementarDiagramas;

public class Gato extends Animal {
	
	private String mia;
	
	public Gato(String nome, String raca) {
		super(nome, raca);
		System.out.println("O seu gato é o(a) " +nome+" de raça "+raca);
	}

	public void setMia(String mia) {
		this.mia = mia;
	}
	
	public String getMia() {
		return mia;
	}
	

}
