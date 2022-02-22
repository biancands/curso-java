package empresaRegistros;

public class FuncionarioGraduado extends Funcionario {
	
	@Override
	public void getGrauDeEscolaridade() {
		// TODO Auto-generated method stub
		System.out.println("Universidade");
		super.getGrauDeEscolaridade();
	}
	
	@Override
	public double getRenda() {
		// TODO Auto-generated method stub
		return super.getRenda()+super.getRenda();
	}

}
