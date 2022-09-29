public class ContaCorrente extends Conta{
	
	public ContaCorrente(int agencia, Banco banco) {
		
		super.agencia = agencia;
		super.conta = banco.getSEQUENCIAL();
		super.tipoDeConta = Tipos.CORRENTE;
		
	}

	public void imprimeExtrato() {
		System.out.println("Extrato Conta Corrente:");
		super.imprimeInfos();
	}
}
