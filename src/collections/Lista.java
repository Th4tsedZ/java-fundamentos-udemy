package collections;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<String> aprovados = new ArrayList<>();
        aprovados.add("João");
        aprovados.add("Bruna");
        aprovados.add("Bianca");
        aprovados.add("Rafael");

        System.out.println(aprovados.get(1));

        aprovados.add("Rafael");

        System.out.println("Tamanho: " + aprovados.size());

        System.out.println(aprovados.remove("Bianca"));

        System.out.println("Tamanho: " + aprovados.size());

        System.out.println("---------------------");

        for (String nome : aprovados){
            System.out.println(nome);
        }
    }
}
