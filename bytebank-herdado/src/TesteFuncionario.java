
public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario renan = new Funcionario();
		
		renan.setNome("Renan Kalfa");
		renan.setCpf("885265826-22");
		renan.setSalario(2600);
		
		System.out.println(renan.getCpf());
		System.out.println(renan.getBonificacao());
		System.out.println(renan.getNome());
		System.out.println(renan.getSalario());
	}

}
