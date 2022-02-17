package show;

public class VIP extends Ingresso{
	
	public VIP() {
		System.out.println("Ingresso VIP");
	}
	
	@Override
	public double getValorDoIngresso() {
		// TODO Auto-generated method stub
		return 500 + super.getValorDoIngresso();
	}

}
