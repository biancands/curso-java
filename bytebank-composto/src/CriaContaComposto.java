
public class CriaContaComposto {
	
	public static void main(String[] args) {
		Conta contaDoRenan = new Conta();
		
		contaDoRenan.titular = new Cliente();
		contaDoRenan.titular.nome = "Renan Kalfa";
		System.out.println(contaDoRenan.titular.nome);
		
		Conta contaDaBianca = new Conta();
		contaDaBianca.saldo = 1400;
		contaDaBianca.titular = new Cliente();
		contaDaBianca.titular.cpf = "3204828438";
		contaDaBianca.titular.profissao = "estudante";
		contaDaBianca.titular.nome = "Bianca Neves";
		System.out.println(contaDaBianca.titular.profissao);
		
	}

}
