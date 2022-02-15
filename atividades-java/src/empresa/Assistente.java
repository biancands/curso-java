package empresa;

public abstract class Assistente extends Funcionario {
	
	private double matricula;
	
	public void setMatricula(double matricula) {
		this.matricula = matricula;
	}
	
	public double getMatricula() {
		return matricula;
	}
	
	public void verificaMatricula(double valor){
		if (valor != this.matricula) {
			throw new MatriculaIncorretaException("matricula incorreta");
		}
		System.out.println("Matricula confere");
		
	}
	
	public double getBonificacao() {
		return 0 + super.getSalario();
	}
	

}
