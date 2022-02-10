
public class TesteSistema {
	
	public static void main(String[] args) {
		
		Gerente felipe  = new Gerente();
		felipe.setSenha(2222);

		SistemaInterno si = new SistemaInterno();

		si.autentica(felipe);
		
		Autenticavel bianca = new Gerente();
		bianca.setSenha(254);
		
		SistemaInterno si2 = new SistemaInterno();
		
		si2.autentica(bianca);
	}

} 
