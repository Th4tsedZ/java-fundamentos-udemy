package controle;

import java.util.Scanner;

public class Exercicio3Controle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double notaUm, notaDois, media;

        System.out.printf("Digite a primeira nota: ");
        notaUm = scanner.nextDouble();

        System.out.printf("Digite a segunda nota: ");
        notaDois = scanner.nextDouble();

        media = (notaUm + notaDois) / 2;

        if (notaUm >= 0 && notaUm <= 10 && notaDois >= 0 && notaDois <= 10) {
            if (media >= 7) {
                System.out.println("Aprovado!");
            } else if (media < 7 && media > 4) {
                System.out.println("Recuperação!");
            } else {
                System.out.println("Reprovado!");
            }
        } else {
            System.out.printf("Nota inválida!\nDigite uma nota maior que 0 e menor que 10!");
        }
        scanner.close();
    }
}
