package exerciciosextras.escola.test.cadastro;

import exerciciosextras.escola.classes.Aluno;
import exerciciosextras.escola.classes.Endereco;
import exerciciosextras.escola.classes.Pessoa;

public class CadastroAluno {
    public static void main(String[] args) {
        Endereco enderecoAluno1 = new Endereco();
        Pessoa aluno1 = new Aluno();

        aluno1.inserirDadosCadastro();
        enderecoAluno1.inserirEndereco();

        aluno1.setEndereco(enderecoAluno1);

        System.out.println("-----------------------------");
        aluno1.imprimirDados(aluno1);
    }
}
