package animal;

public class Cachorro extends Animal implements Som {

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("latindo");
	}
	
	public void getCorrer() {
		System.out.println("correndo");
		
	}

}
