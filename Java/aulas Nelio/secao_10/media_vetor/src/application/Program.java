package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		System.out.printf("Digite o numero de alturas a serem coletadas: ");
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		double soma = 0.0;
		
		System.out.printf("%n%n");
		
		for(int i=0; i<n; i++)
		{
			System.out.printf("Insira a altura: ");
			vect[i] = sc.nextDouble();
			soma+=vect[i];
		}
		double media = soma/n;
		
		System.out.printf("%n%nMedia das alturas: %.2f", media);

		sc.close();
	}

}
