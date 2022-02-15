package empresa;

public class Administrativo extends Assistente {
	
	@Override
	public void setSalario(double salario) {
		if (salario > 2250.0) {
			throw new ValorNaoNegociavelException ("Valor superior ao maximo permitido para esta categoria");
		}
		super.setSalario(salario);
	}
	
	@Override
	public double getBonificacao() {
		return 0.10*super.getBonificacao();
	}
	
	
}
