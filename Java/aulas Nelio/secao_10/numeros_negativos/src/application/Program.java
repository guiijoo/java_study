package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira aqui um valo de 0 a 10");
		System.out.printf("->");
		int n = sc.nextInt();

		int[] vetor = new int[n];

		if (n < 0 || n > 10) {
			System.out.println("");
			System.out.println("Valor invalido!");
		} else {
			for (int i = 0; i < n; i++) {
				System.out.printf((i + 1) + "->");
				vetor[i] = sc.nextInt();
			}
			System.out.println("Números negativos: ");
			for (int i = 0; i < n; i++) {
				if (vetor[i] < 0) {
					System.out.println(vetor[i]);
				} else {

				}
			}
		}

		sc.close();
	}

}
