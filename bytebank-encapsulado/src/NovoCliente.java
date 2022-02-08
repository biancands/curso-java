
public class NovoCliente {
	
	public static void main(String[] args) {
		
		Cliente renan = new Cliente();
		
		renan.setNome("Renan Kalfa");
		renan.setProfissao("ciencia de dados");
		renan.setCpf("222.222.222.-22");
		
		System.out.println("O novo cliente "+renan.getNome()+" pertencente ao cpf "+renan.getCpf()+" com a profissão "
		+renan.getProfissao()+" deseja abrir uma conta");
		
		Conta contaDoRenan = new Conta(2562,2578);
		contaDoRenan.setTitular(renan);
		contaDoRenan.deposita(4200);
		contaDoRenan.saca(500);
		System.out.println(contaDoRenan.getSaldo());
		System.out.println(contaDoRenan.getTitular().getNome());
		System.out.println(Conta.getTotal());
	}

}
