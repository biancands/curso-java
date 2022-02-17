package implementarDiagramas;

public class Cachorro extends Animal {
	
	private String late;
	
	
	public Cachorro(String nome, String raca) {
		super(nome, raca);
		System.out.println("O seu cachorro é o(a) " +nome+" de raça "+raca);
	}
	
	public void setLate(String late) {
		this.late = late;
	}
	
	public String getLate() {
		return late;
	}

}
