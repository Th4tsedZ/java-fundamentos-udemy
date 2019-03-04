package exerciciosextras.escola.classes;

import java.util.Scanner;

abstract class Funcionario extends Pessoa {
    private double salario;

    Funcionario() {
    }

    public double getSalario() {
        return salario;
    }

    private void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void inserirDadosCadastro() {
        super.inserirDadosCadastro();
        Scanner sc = new Scanner(System.in);
        System.out.print("Salário: ");
        this.setSalario(sc.nextDouble());
    }

    @Override
    public void imprimirDados(Pessoa pessoa) {
        super.imprimirDados(pessoa);
        System.out.println("Salário: R$" + this.salario);
    }
}
