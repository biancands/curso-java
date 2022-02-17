package implementarDiagramas;

public class TestePessoa {
	
	public static void main(String[] args) {
		
		Rica patricia = new Rica("patricia", 20);
		patricia.setDinheiro(1000000);
		patricia.fazCompras();
		System.out.println(patricia.getDinheiro());
		
		Pobre ricardo = new Pobre("Ricardo", 47);
		ricardo.trabalha("auxiliar de cozinha", 1300);
		System.out.println(ricardo.getProfissao());
		System.out.println(ricardo.getSalario());
		
		Miseravel tau = new Miseravel("Tau", 32);
		
		System.out.println(tau.getTrocado());
		tau.mendiga(0.50);
		System.out.println(tau.getTrocado());
		
	}
}
