package controle;

import java.util.Scanner;

public class Exercicio9Controle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero, soma = 0, maior = 0;
		
		System.out.print("Digite um número: ");
		numero = scanner.nextInt();
		
		soma += numero;
		maior = numero;
		
		for (int i = 0; i < 9; i++) {
			System.out.print("Digite um número: ");
			numero = scanner.nextInt();
			soma += numero;
			if (numero > maior){
				maior = numero;
			}
		}
		scanner.close();
		System.out.print("O maior número entre os digitados é: " + maior );
	}
}
