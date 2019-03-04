package api;

public class ExplorandoString {
    public static void main(String[] args) {
        String nome = "Leonardo";

        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.length());
        System.out.println(nome.substring(0, 3));
        System.out.println(nome.indexOf("a"));
        System.out.println(nome.charAt(6));
        System.out.println(nome.equalsIgnoreCase("leonardo"));
        System.out.println(nome.startsWith("Leo"));
        System.out.println(nome.isEmpty());
        System.out.println(nome.concat(" é legal").concat("!"));

        nome = nome.toUpperCase().substring(0, 3).concat(" é legal");

        System.out.println(nome);

    }
}
