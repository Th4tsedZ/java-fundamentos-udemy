package exerciciosextras.escola.classes;

public class Coordenador extends Funcionario {
    private Professor[] professores;

    public Coordenador() {
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }

    @Override
    public void imprimirDados(Pessoa pessoa) {
        super.imprimirDados(pessoa);
        System.out.print("Professores coordenados: ");
        for (Pessoa nome : professores){
            System.out.print(nome.getNome() + " ");
        }
    }
}
