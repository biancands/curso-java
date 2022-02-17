package implementarDiagramas;

import java.util.Scanner;

public class Rica extends Pessoa {
	
	private double dinheiro;

	public Rica(String nome, int idade) {
		super(nome, idade);
		System.out.println(nome+", "+idade+" anos");
	}
	
	public void fazCompras() {
		
		Scanner x = new Scanner (System.in);
		System.out.println("Digite o valor gasto nas compras: ");
		Double valor = x.nextDouble();
		
		this.dinheiro -= valor;
	}
	
	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}
	
	public double getDinheiro() {
		return dinheiro;
	}

}
