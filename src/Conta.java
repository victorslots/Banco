public abstract class Conta implements IConta{
	
	protected int agencia;
	protected int conta;
	protected double saldo;
	protected Cliente cliente;
	Tipos tipoDeConta;
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getConta() {
		return conta;
	}
	
	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
	}
	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	
	protected void imprimeInfos() {
		System.out.println("Agencia:"+this.agencia+" | Conta:"+this.conta);
		System.out.printf("Saldo: %.2f\n\n",saldo);
	}
}