package empresa;

import java.util.Scanner;

public class TesteEmpresa {
	
	public static void main(String[] args) {
		
		Gerente gustavo = new Gerente ();
		gustavo.setSalario(6000);
		System.out.println(gustavo.getSalario());
		
		Scanner sc1 = new Scanner (System.in);
		System.out.println("Digite o valor do salário: ");
		String dadoEntrada = sc1.nextLine();
		double aDouble = Double.parseDouble(dadoEntrada);
		gustavo.setSalario(aDouble);
		
		System.out.println(dadoEntrada);
		
		Administrativo priscila = new Administrativo();
		priscila.setSalario(1200);
		priscila.setMatricula(123);
		System.out.println(priscila.getSalario());
		System.out.println(priscila.getBonificacao());
		System.out.println(priscila.setTurno("noite"));
		
		Tecnico felipe = new Tecnico();
		felipe.setSalario(2000);
		System.out.println(felipe.getBonificacao());
		
		
		
	}

}
