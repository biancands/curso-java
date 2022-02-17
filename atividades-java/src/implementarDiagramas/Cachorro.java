package implementarDiagramas;

public class Cachorro extends Animal {
	
	private String late;
	
	
	public Cachorro(String nome, String raca) {
		super(nome, raca);
		System.out.println("O seu cachorro � o(a) " +nome+" de ra�a "+raca);
	}
	
	public void setLate(String late) {
		this.late = late;
	}
	
	public String getLate() {
		return late;
	}

}
