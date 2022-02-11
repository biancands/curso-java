package dataDeNascimento;

public class DataDeNascimento {
	private int dia;
	private int ano;
	private int mes;
	
	public void data (int dia, int mes, int ano) {
		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
		switch (this.mes) {
        case 1:
            System.out.println("Você nasceu em "+this.dia+" de Janeiro de "+this.ano);
            break;
        case 2:
            System.out.println("Você nasceu em "+this.dia+" de Fevereiro de "+this.ano);
            break;
        case 3:
            System.out.println("Você nasceu em "+this.dia+" de Março de "+this.ano);
            break;
        case 4:
            System.out.println("Você nasceu em "+this.dia+" de Abril de "+this.ano);
            break;
        case 5:
            System.out.println("Você nasceu em "+this.dia+" de Maio de "+this.ano);
            break;
        case 6:
            System.out.println("Você nasceu em "+this.dia+" de Junho de "+this.ano);
            break;
        case 7:
            System.out.println("Você nasceu em "+this.dia+" de Julho de "+this.ano);
            break;
        case 8:
            System.out.println("Você nasceu em "+this.dia+" de Agosto de "+this.ano);
            break;
        case 9:
            System.out.println("Você nasceu em "+this.dia+" de Setembro de "+this.ano);
            break;
        case 10:
            System.out.println("Você nasceu em "+this.dia+" de Outubro de "+this.ano);
            break;
        case 11:
            System.out.println("Você nasceu em "+this.dia+" de Novembro de "+this.ano);
            break;
        case 12:
            System.out.println("Você nasceu em "+this.dia+" de Dezembro de "+this.ano);
            break;
        default:
            System.out.println("Mês inválido");
            break;
    }
	}

}
