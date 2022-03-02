package empresa;

public class Vendedor extends Funcionario{
	
	@Override
	public void setSalario(double salario) {
		
		if (salario>1500) {
			throw new ValorNaoNegociavelException("Valor superior ao maximo permitido para esta categoria");
		}
		super.setSalario(salario);
	}
	
	@Override
	public double getComissao() {
		// TODO Auto-generated method stub
		return 250+super.getComissao();
	}

}
