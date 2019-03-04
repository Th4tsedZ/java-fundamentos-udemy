package exerciciosextras.escola.classes;

public class Sala {
    private int numeroSala;
    private final int ESPACO_SALA = 35;
    private Aluno[] alunos;
    private Professor[] professores;

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public int getESPACO_SALA() {
        return ESPACO_SALA;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
