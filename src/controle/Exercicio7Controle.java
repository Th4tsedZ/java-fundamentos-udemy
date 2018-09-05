package controle;

import java.util.Scanner;

public class Exercicio7Controle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero, soma = 0;
		
		System.out.print("Digite um número: ");
		numero = scanner.nextInt();
		soma = numero;
		
		while (numero >= 0) {
			System.out.print("Digite um número: ");
			numero = scanner.nextInt();
			if (numero < 0) {
				break;
			}
			soma += numero;
		}
		scanner.close();
		System.out.print("A soma dos números digitados é: " + soma);
	}
}
