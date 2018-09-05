package controle;

import java.util.Scanner;

public class Exercicio4Controle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero, cont = 0;
		
		System.out.print("Informe um número inteiro positivo: ");
		numero = scanner.nextInt();
		
		if (numero >= 0) {
			for (int i = 1; i <= numero; i++) {
				if (numero %i == 0) {
					cont ++;
				}
			}
			if (cont <= 2 && numero != 1) {
				System.out.print("O número " + numero + " é primo!");
			}
			else {
				System.out.print("O número " + numero + " não é primo!");
			}
		}
		else {
			System.out.print("Número inválido!\nInforme um número inteiro positivo.");
		}
		scanner.close();
	}
}
