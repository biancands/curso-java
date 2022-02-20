package vendaImovel;

public abstract class Imovel {
	
	private String endereco;
	private double preco;
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public double getPreco() {
		return preco;
	}

}
