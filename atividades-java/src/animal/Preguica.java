package animal;

public class Preguica extends Animal implements Som {

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("emitindo som caracteristico");
	}
	
	public void getSubirEmArvores() {
		System.out.println("subindo na arvore");
	}

}
