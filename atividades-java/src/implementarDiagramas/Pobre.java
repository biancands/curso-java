package implementarDiagramas;

import java.util.Scanner;

public class Pobre extends Pessoa {
	
	private String profissao;
	private double salario;

	public Pobre(String nome, int idade) {
		super(nome, idade);
		System.out.println(nome+", "+idade+" anos");
	}
	
	public void trabalha(String profissao, double salario) {
		this.profissao = profissao;
		this.salario = salario;
	}
	
	public String getProfissao() {
		return profissao;
	}
	
	public double getSalario() {
		return salario;
	}

}
