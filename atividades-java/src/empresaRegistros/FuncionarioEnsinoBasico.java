package empresaRegistros;

public class FuncionarioEnsinoBasico extends Funcionario {
	
	@Override
	public void getGrauDeEscolaridade() {
		System.out.println("escola");
		super.getGrauDeEscolaridade();
	}
	
	@Override
	public double getRenda() {
		// TODO Auto-generated method stub
		return (0.10*super.getRenda())+super.getRenda();
	}
}
