package empresa;

public class Supervisor extends Funcionario {
	
	@Override
	public void setSalario(double salario) {
		
		if (salario > 3000) {
			throw new ValorNaoNegociavelException("Valor superior ao maximo permitido para esta categoria");
		}
		super.setSalario(salario);
	}
	
	@Override
	public double getComissao() {
		// TODO Auto-generated method stub
		return 600+super.getComissao();
	}

}
