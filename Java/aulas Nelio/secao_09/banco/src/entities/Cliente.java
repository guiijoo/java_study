package entities;

public class Cliente {
	private int numConta;
	private String nomeCliente;
	private double saldo;

	// construtores
	
	public Cliente()
	{
		
	}

	public Cliente(int numConta, String nomeCliente, double saldo) {
		super();
		this.numConta = numConta;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
	}

	public Cliente(int numConta, String nomeCliente) {
		super();
		this.numConta = numConta;
		this.nomeCliente = nomeCliente;
	}
	// -------------------------------------------------------------------

	// getters e setters

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getSaldo() {
		return saldo;
	}
	// -------------------------------------------------------------------

	// funções

	public String toString() {

		return "Numero da conta: " + numConta + " || Nome do cliente: " + nomeCliente + " || Saldo em conta: $"
				+ String.format("%.2f", saldo);
	}

	public void deposito(double valor)
	{
		saldo += valor;
	}
	
	public void saque(double valor)
	{
		saldo -= valor + 5;
	}
}