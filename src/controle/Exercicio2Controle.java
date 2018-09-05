package controle;

import java.util.Scanner;

public class Exercicio2Controle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int ano;
		
		System.out.print("Digite o ano: ");
		ano = scanner.nextInt();
		
		if(ano %4 == 0 && ano %100 != 0 || ano %400 ==0) {
			System.out.printf("O ano de " + ano + " é bissexto!");
		}
		else {
			System.out.printf("O ano de " + ano + " não é bissexto!");
		}
		scanner.close();
	}
}
