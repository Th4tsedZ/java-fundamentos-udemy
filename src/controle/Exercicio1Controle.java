package controle;

import java.util.Scanner;

public class Exercicio1Controle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		
		System.out.print("Digite um valor: ");
		numero = scanner.nextInt();
		
		if (numero > 0 && numero < 10) {
			if (numero %2 == 0) {
				System.out.printf("O número " + numero + " está entre 0 e 10 e é par!");
			}
			else {
				System.out.printf("O número " + numero + " está entre 0 e 10 e é ímpar!");
			}
		}
		else {
			System.out.printf("O número " + numero + " é inválido!\nDigite um valor entre 0 e 10!" );
		}
		scanner.close();
	}
}
