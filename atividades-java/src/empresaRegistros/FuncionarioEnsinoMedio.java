package empresaRegistros;

public class FuncionarioEnsinoMedio extends Funcionario {
	
	@Override
	public void getGrauDeEscolaridade() {
		System.out.println("escola");
		super.getGrauDeEscolaridade();
	}
	
	@Override
	public double getRenda() {
		// TODO Auto-generated method stub
		return (0.50*super.getRenda()) + super.getRenda();
	}

}
