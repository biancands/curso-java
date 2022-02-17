package show;

public abstract class Ingresso {
	
	private double valorDoIngresso;
	
	public void imprimeValor(double valorDoIngresso) {
		this.valorDoIngresso = valorDoIngresso;
	}
	
	public double getValorDoIngresso() {
		return valorDoIngresso;
	}

}
