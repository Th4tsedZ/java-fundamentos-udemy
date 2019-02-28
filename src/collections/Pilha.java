package collections;

import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();

        pilha.push("O pequeno príncipe");
        pilha.push("O Hobbit");
        pilha.push("Don Quixote");

        System.out.println(pilha.pop());

        for (String filme : pilha){
            System.out.println(filme);
        }
    }
}
