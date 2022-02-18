package vendaImovel;

import java.util.Scanner;

public abstract class Imovel {
	
	private String endereco;
	private double preco;
	
	public double vendaImoveis() {
		
		Scanner x = new Scanner (System.in);
		System.out.println("Digite a opção do valor desejado:\n "+"A -> imovel novo\n "+"B -> imovel velho");
		String opcao = x.nextLine();
		
		if (opcao == "A") {
			
		}
		
	}
	
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
