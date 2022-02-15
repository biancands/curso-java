package empresa;

public class TesteEmpresa {
	
	public static void main(String[] args) {
		
		Gerente gustavo = new Gerente ();
		
		gustavo.setSalario(6000);
		
		System.out.println(gustavo.getSalario());
	}

}
