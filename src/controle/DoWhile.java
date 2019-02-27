package controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota = 0;
        double somaDasNotas = 0;
        int contador = 0;

        do {
            System.out.printf("Digite a nota: ");
            nota = scanner.nextDouble();

            if (nota <= 10 && nota >= 0) {
                somaDasNotas += nota;
                contador++;
            }
        } while (nota != -1);
        scanner.close();
        System.out.printf("A média das notas é: %.2f!", somaDasNotas / contador);
    }
}
