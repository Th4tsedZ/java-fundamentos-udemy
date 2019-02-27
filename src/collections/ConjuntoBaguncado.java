package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoBaguncado {
    public static void main(String[] args) {
        Set<String> nomesAlunos = new HashSet<>();

        nomesAlunos.add("João");
        nomesAlunos.add("Bruna");
        nomesAlunos.add("Bianca");

        for (Object nome : nomesAlunos){
            System.out.println(nome);
        }

    }
}
