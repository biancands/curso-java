
public class TesteContas {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(231, 426);
		cc.deposita(250.0);
		
		ContaPoupanca cp = new ContaPoupanca(121, 572);
		cp.deposita(1000.0);
		
		cc.tranfere(50, cp);
		System.out.println("CC: "+ cc.getSaldo());
		System.out.println("CP: "+ cp.getSaldo());
		cc.saca(10);
		System.out.println(cc.getSaldo());

	}

}
