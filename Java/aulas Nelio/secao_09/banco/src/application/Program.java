package application;

import java.util.Scanner;

import entities.Cliente;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cliente cli;

		System.out.printf("Insira o número da conta: ");
		int numConta = sc.nextInt();

		System.out.printf("Insira o seu nome: ");
		String nome = sc.next();

		System.out.println("Deseja realizar um deposito?");
		System.out.printf("1.sim%n2.não%nescolha: ");
		int escolha = sc.nextInt();

		switch (escolha) {
		case 1:

			System.out.printf("%nInsira o valor a ser depositado: $");
			double valor = sc.nextDouble();

			cli = new Cliente(numConta, nome, valor);

			break;

		case 2:

			cli = new Cliente(numConta, nome);

			break;

		default:
			cli = new Cliente();
			System.out.println("Valor invalido");

		}

		System.out.println("Dados da conta:");
		System.out.println(cli);

		System.out.println("");
		System.out.printf("%n%nEntre um valor de deposito: $");
		double valor = sc.nextDouble();
		cli.deposito(valor);
		
		System.out.println("");
		System.out.println("Dados atualizados da conta:");
		System.out.println(cli);
		
		System.out.printf("%n%nEntre um valor de saque: $");
		valor = sc.nextDouble();
		cli.saque(valor);
		
		System.out.println("Dados atualizados da conta:");
		System.out.println(cli);
		

		sc.close();
	}

}
