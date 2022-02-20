package vendaImovel;

import java.util.Scanner;

public class VendaImovel {
	
	public static void main(String[] args) {
			
		Scanner x = new Scanner (System.in);
		System.out.println("Digite a opção do valor desejado:\n "+"A -> imovel novo\n "+"B -> imovel velho");
		String opcao = x.nextLine();
		
		switch (opcao) {
		case "A":
			Scanner y = new Scanner (System.in);
			System.out.println("imovel novo selecionado\n"+"digite o endereço desejado:");
			String enderecoSelecionado = y.nextLine();
			
			Novo imovel = new Novo();
			imovel.setEndereco(enderecoSelecionado);
			System.out.println(imovel.getEndereco());
			
			Scanner valor = new Scanner (System.in);
			System.out.println("Digite o valor da opção do imovel desejado:\n"+"A -> casa pequena - 210000\n"+
			"B -> casa média - 300000\n"+"C -> casa grande - 490000");
			Double casaSelecionada = valor.nextDouble();
			imovel.setPreco(casaSelecionada);
			System.out.println(imovel.getPreco());
			System.out.println("A sua nova casa fica no endereço "+imovel.getEndereco()+" e custa "+imovel.getPreco()+ " reais.");
			
			break;
		case "B":
			Scanner z = new Scanner (System.in);
			System.out.println("imovel velho selecionado\n"+"digite o endereço desejado:");
			String enderecoSelecionado2 = z.nextLine();
			
			Velho imovel2 = new Velho();
			imovel2.setEndereco(enderecoSelecionado2);
			System.out.println(imovel2.getEndereco());
			
			Scanner valor2 = new Scanner (System.in);
			System.out.println("Digite o valor da opção do imovel desejado:\n"+"A -> casa pequena - 210000\n"+
			"B -> casa média - 300000\n"+"C -> casa grande - 490000");
			Double casaSelecionada2 = valor2.nextDouble();
			imovel2.setPreco(casaSelecionada2);
			System.out.println(imovel2.getPreco());
			System.out.println("A sua nova casa fica no endereço "+imovel2.getEndereco()+" e custa "+imovel2.getPreco()+ " reais.");
			break;
			
		default:
            throw new OpcaoIncorretaException ("Opção selecionada inexistente");
		}

	}
}
