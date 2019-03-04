package exerciciosextras.escola.test.cadastro;

import exerciciosextras.escola.classes.Coordenador;
import exerciciosextras.escola.classes.Endereco;
import exerciciosextras.escola.classes.Professor;

public class CadastroCoordenador {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco();
        Coordenador coordenador1 = new Coordenador();
        Professor professor1 = new Professor();
        professor1.setNome("Bruno Silva");
        Professor professor2 = new Professor();
        professor2.setNome("Maria Antonieta");
        Professor[] professores = new Professor[2];

        professores[0] = professor1;
        professores[1] = professor2;

        coordenador1.inserirDadosCadastro();
        endereco1.inserirEndereco();
        coordenador1.setEndereco(endereco1);
        coordenador1.setProfessores(professores);

        System.out.println("-----------------------------");
        coordenador1.imprimirDados(coordenador1);
    }
}
