package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.add("João");
        fila.add("Bruna");
        fila.add("Bianca");
        fila.add("Rafael");

        fila.poll();

        for (String nome : fila){
            System.out.println(nome);
        }
    }
}
