package collections;

public class EnderecoTest {
    public static void main(String[] args) {
        Endereco endereco =  new Endereco("Rua loop inifinito", 1, "Sala 1001");
        Endereco endereco2 =  new Endereco("Rua loop inifinito", 1, "Sala 1001");

        System.out.println(endereco.equals(endereco2));
    }
}