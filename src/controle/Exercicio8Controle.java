package controle;

import java.util.Scanner;

public class Exercicio8Controle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String palavra;
		char[] letras;
		
		System.out.print("Digite uma palavra: ");
		palavra = scanner.nextLine();
		letras = palavra.toCharArray();
		
		for(int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
		}
		scanner.close();
	}
}
