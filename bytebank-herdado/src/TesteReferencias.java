
public class TesteReferencias {
	
	public static void main(String[] args) {
		
		Gerente bianca = new Gerente();
		bianca.setNome("Bianca");
		bianca.setSalario(4000.0);
		
		EditorVideo renan = new EditorVideo();
		renan.setNome("Renan");
		renan.setSalario(2500.0);
		
		Designer beatriz = new Designer();
		beatriz.setSalario(4200);
		beatriz.setNome("Beatriz");
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(beatriz);
		controle.registra(renan);
		controle.registra(bianca);
		
		System.out.println(controle.getSoma());
	}

}
