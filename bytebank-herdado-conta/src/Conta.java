

public abstract class Conta {
	
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	public Conta(int agencia, int numero) {
		total ++;
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 0;
		System.out.println("Criando uma conta");
	}
	
	public abstract void deposita (double valor);
	
	public void saca(double valor) throws SaldoInsuficienteException{

        if(this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        } 

        this.saldo -= valor;       
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
	    this.saca(valor);
	    destino.deposita(valor);
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}

}


