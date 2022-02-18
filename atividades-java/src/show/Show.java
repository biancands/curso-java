package show;

public class Show {
	
	public static void main(String[] args) {
		
		VIP showBanda = new VIP();
		
		showBanda.imprimeValor(600);
		System.out.println(showBanda.getValorDoIngresso());
		
		VIP showBanda2 = new CamaroteSuperior();
		
		showBanda2.imprimeValor(600);
		System.out.println(showBanda.getValorDoIngresso());
		
	}
	
	

}
