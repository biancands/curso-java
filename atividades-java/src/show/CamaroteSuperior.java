package show;

public class CamaroteSuperior extends VIP {
	
	public CamaroteSuperior() {
		System.out.println("Camarote Superior");
	}
	@Override
	public double getValorDoIngresso() {
		// TODO Auto-generated method stub
		return 250 + super.getValorDoIngresso();
	}

}
