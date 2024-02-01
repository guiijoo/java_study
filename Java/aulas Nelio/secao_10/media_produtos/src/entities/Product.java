package entities;

public class Product {
	
	private String nome;
	private double valor;
	
	public Product(String nome, double valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}
	
	public String toString()
	{
		return "Nome do produto: "
				+ nome
				+ " || Valor do Produto: "
				+ String.format("$%.2f", valor);
	}	

}
