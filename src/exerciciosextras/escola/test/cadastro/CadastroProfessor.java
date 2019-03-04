package exerciciosextras.escola.test.cadastro;

import exerciciosextras.escola.classes.Endereco;
import exerciciosextras.escola.classes.Pessoa;
import exerciciosextras.escola.classes.Professor;

public class CadastroProfessor {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco();
        Pessoa professor1 = new Professor();

        professor1.inserirDadosCadastro();
        endereco1.inserirEndereco();

        professor1.setEndereco(endereco1);

        System.out.println("-----------------------------");
        professor1.imprimirDados(professor1);

    }
}
