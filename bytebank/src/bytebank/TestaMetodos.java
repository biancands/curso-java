package bytebank;

public class TestaMetodos {
	public static void main(String[] args) {
		Conta contaDoRenan = new Conta();
		contaDoRenan.saldo = 2000;
		contaDoRenan.deposita(500);
		System.out.println(contaDoRenan.saldo);
		
		Conta contaDaBianca = new Conta();
		contaDaBianca.saldo = 1200;
		contaDaBianca.saca(200);
		System.out.println(contaDaBianca.saldo);
		
		contaDoRenan.tranfere(1000, contaDaBianca);
		System.out.println("o novo saldo do Renan ? "+contaDoRenan.saldo);
		System.out.println("o novo saldo da Bianca ? "+contaDaBianca.saldo);
		
	}

}
