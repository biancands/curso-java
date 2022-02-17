package implementarDiagramas;

import java.util.Scanner;

public class TestaAnimal {
	
	public static void main(String[] args) {
		
		Scanner x = new Scanner (System.in);
		System.out.println("Digite o nome do seu gato: ");
		String nomeGato = x.nextLine();
		
		Scanner y = new Scanner (System.in);
		System.out.println("Digite a raça do seu gato: ");
		String racaGato = y.nextLine();
		
		Gato gato = new Gato(nomeGato, racaGato);
		
	}

}
