
public class TesteGerente {
	
	public static void main(String[] args) {
		
		Gerente bianca = new Gerente();
		
		bianca.setNome("Bianca Neves");
		bianca.setSalario(5000);
		bianca.setSenha(252);
		
		boolean autenticou = bianca.autentica(255);
		System.out.println(autenticou);
		System.out.println(bianca.getBonificacao());
		
	}

}
