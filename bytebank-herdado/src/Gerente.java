
public class Gerente extends Funcionario implements Autenticavel {
	
	
	
	private int senha;

	public double getBonificacao() {
		return 2000.0 + super.getSalario();
	}

	@Override
    public void setSenha(int senha){
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha){

        if(this.senha == senha){
            return true;
        } else {
            return false;
        }

    }
}
