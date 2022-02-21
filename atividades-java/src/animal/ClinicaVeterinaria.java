package animal;

public class ClinicaVeterinaria {
	
	public static void main(String[] args) {
		
		Veterinario felipe = new Veterinario();
		
		felipe.setExaminar("cavalo");
		
		switch (felipe.getExaminar()) {
		case "cachorro":
			Cachorro dog = new Cachorro();
			dog.emitirSom();
			break;

		case "cavalo":
			Cavalo cavalo = new Cavalo();
			cavalo.emitirSom();
			break;
			
		case "preguica":
			Preguica preguica = new Preguica();
			preguica.emitirSom();
			break;
			
		default:
			System.out.println("parametro errado");
			break;
		}
	}

}
