public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(int agencia, Banco banco) {
		
		super.agencia = agencia;
		super.conta = banco.getSEQUENCIAL();
		super.tipoDeConta = Tipos.POUPANCA;
		
	}

	public void imprimeExtrato() {
		System.out.println("Extrato Poupanca:");
		super.imprimeInfos();
	}
}
