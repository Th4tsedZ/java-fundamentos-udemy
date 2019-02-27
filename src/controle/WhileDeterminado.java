package controle;

import java.util.Scanner;

public class WhileDeterminado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double somaDasNotas = 0;
        double nota = 0;
        int numeroDeNotas = 1;

        while (numeroDeNotas <= 3) {
            System.out.printf("Digite a %dº nota do aluno: ", numeroDeNotas);
            nota = scanner.nextDouble();
            somaDasNotas += nota;
            numeroDeNotas++;
        }
        scanner.close();
        System.out.printf("A média das três notas é: %.2f!", somaDasNotas / 3);
    }
}
