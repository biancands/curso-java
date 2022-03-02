package empresa;

public class Gerente extends Funcionario {
	
	@Override
	public void setSalario(double salario) {
		if (salario > 6250) {
			throw new ValorNaoNegociavelException ("Valor superior ao maximo permitido para esta categoria");
		}
		super.setSalario(salario);
	}
	
	@Override
	public double getComissao() {
		// TODO Auto-generated method stub
		return 1500+super.getComissao();
	}

}
