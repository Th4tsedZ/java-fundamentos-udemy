package collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class ConjuntoComportado {
    public static void main(String[] args) {
        Set<String> aprovados =  new LinkedHashSet<>();

        aprovados.add("João");
        aprovados.add("Bruna");
        aprovados.add("Bianca");

        for (String nome : aprovados){
            System.out.println(nome);
        }
    }
}
