package empresa;

public class Tecnico extends Assistente  {
	
	@Override
	public void setSalario(double salario) {
		if (salario > 3500) {
			throw new ValorNaoNegociavelException ("Valor superior ao maximo permitido para esta categoria");
		}
		super.setSalario(salario);
	}

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 500.0 + super.getBonificacao();
	}
	
	
	
}
