package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Insira a quantida de produtoas a serem cadastrados: ");
		int n = sc.nextInt();
		double soma = 0.0;
		Product[] prod = new Product[n];
		
		for(int i=0; i<n; i++)
		{
			System.out.printf("%n%n");
			System.out.println("Produto "+ (i+1) +":");
			
			System.out.printf("Nome: ");
			String nome = sc.next();
			
			System.out.printf("Valor: ");
			double valor = sc.nextDouble();
			
			prod[i] = new Product(nome, valor);
			soma += valor;
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.printf("%n");
			System.out.println("Produto "+ (i+1) +":");
			System.out.println(prod[i]);
		}
		
		double media = soma/n;
		System.out.printf("%n");
		System.out.println("O valor médio dos produtos é: "+String.format("$%.2f", media));
		
		sc.close();
		
	}

}
