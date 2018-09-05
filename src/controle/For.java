package controle;

import java.util.Scanner;

public class For {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double somaDasNotas = 0;
		double nota = 0;
		
		for(int contador = 0; contador < 3; contador++) {
			System.out.printf("Digite a nota do aluno: ");
			nota = scanner.nextDouble();
			somaDasNotas += nota;
		}
		scanner.close();
		System.out.printf("A média das notas é: %.2f", somaDasNotas / 3);
	
		//while(contador < 3) {
			//System.out.printf("Digite a nota: ");
			//nota = scanner.nextDouble();
			//somaDasNotas += nota;
			//contador++;
		//}
		//scanner.close();
		//System.out.printf("A média das notas é: %.2f", somaDasNotas / 3);
	}
}
