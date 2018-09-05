package controle;

import java.util.Scanner;

public class Exercicio6Controle {
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
			
			switch (cont) {
			case 2:
				System.out.println("O número " + numero + " é um número primo. ");
				break;

			default:
				System.out.println("O número " + numero + " não é um número primo. ");
				break;
			}
		}
		else {
			System.out.print("Número inválido!\nInforme um número inteiro positivo.");
		}
		scanner.close();
	}
}
