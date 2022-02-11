package pessoa;

public class TestePessoa {
	
	public static void main(String[] args) {
		
		Pessoa bianca = new Pessoa("Bianca Neves", 20, 39.0, 1.52);

		bianca.engordar(3.5);
		System.out.println(bianca.getPeso());
		bianca.emagrecer(1.0);
		System.out.println(bianca.getPeso());

		System.out.println(bianca.envelhecer(4));
		
		bianca.data(1, 9, 2001);
		
		
		
		
	}
	

}
