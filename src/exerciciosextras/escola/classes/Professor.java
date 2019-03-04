package exerciciosextras.escola.classes;

public class Professor extends Funcionario {
    private Aluno[] alunos;
    private Coordenador coordenador;
    private Sala[] salas;

    public Professor() {
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Coordenador getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Coordenador coordenador) {
        this.coordenador = coordenador;
    }

    public Sala[] getSalas() {
        return salas;
    }

    public void setSalas(Sala[] salas) {
        this.salas = salas;
    }

    public void insedirDados() {

    }
}
