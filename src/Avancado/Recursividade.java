package Avancado;

public class Recursividade {

    public static void main(String[] args) {
        System.out.println(fatorialFor(5));
        System.out.println(fatorialRecursivo(1));
    }

    private static int fatorialFor(int numero){
        int fatorial = 1;
        for (int i = 1; i <= numero; i++){
            fatorial *=  i;
        }

        return fatorial;
    }

    private static int fatorialRecursivo(int numero){
        if (numero <= 1){
            return 1;
        }

        return numero * fatorialRecursivo(numero - 1);
    }
}
