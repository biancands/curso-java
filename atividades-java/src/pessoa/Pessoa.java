package pessoa;

import dataDeNascimento.DataDeNascimento;

public class Pessoa extends DataDeNascimento{
	
	private String nome;
	private int idade;
	private double peso;
	private double altura;
	
	public Pessoa (String nome, int idade , double peso, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
		
		System.out.println("A "+this.nome+" tem "+this.idade+" anos, "+this.altura+
				" m de altura, e pesa "+this.peso+" kg");
	}
	
	public void engordar(double valor) {
		this.peso += valor;
		
	}
	
	public void emagrecer (double valor) {
		this.peso -= valor;
	}
	
	public double envelhecer(int anos) {
		return this.idade += anos;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}

	public double getPeso() {
		return peso;
	}
	
	public double getAltura() {
		return altura;
	}
	

}
