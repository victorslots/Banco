import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	public static int AGENCIA = 0;
	private int SEQUENCIAL = 0;
	
	private String nome;
	private int agencia;
	
	private List<Conta> contas = new ArrayList<>();
	private List<Cliente> clientes = new ArrayList<>();
	
	public Banco(String nome) {
		this.nome = nome;
		this.agencia = AGENCIA;
		AGENCIA++;
	}
	
	public int getSEQUENCIAL() {
		return SEQUENCIAL;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void criarCliente(String nome) {
		Cliente cliente = new Cliente(nome);
		clientes.add(cliente);
		
	}
	
	public void criarConta(Tipos tipo) {
		switch(tipo) {
		case CORRENTE:
			contas.add(new ContaCorrente(this.agencia, this));
			SEQUENCIAL++;
			break;
		case POUPANCA:
			contas.add(new ContaPoupanca(this.agencia, this));
			SEQUENCIAL++;
			break;
		}
			
	}
	
}