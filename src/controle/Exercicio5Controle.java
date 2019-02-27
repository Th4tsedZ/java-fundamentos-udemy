package controle;

import java.util.Random;
import java.util.Scanner;

public class Exercicio5Controle {
    public static void main(String[] args) {
        Random gerador = new Random();
        Scanner scanner = new Scanner(System.in);
        int numeroAleatorio, numero, i = 10;

        for (int j = 0; j <= 10; j++) {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();
            numeroAleatorio = gerador.nextInt(101);
            i -= 1;
            if (numero == numeroAleatorio) {
                System.out.print("O número digitado é igual ao número que a máquina escolheu!\nFim do jogo!!! ");
                break;
            } else {
                System.out.print("O número digitado é diferente do número que a máquina escolheu!\n");
                System.out.print("Ainda faltam " + i + " tentativas!\n");
            }
        }
        scanner.close();
    }
}
