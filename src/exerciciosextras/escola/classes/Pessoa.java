package exerciciosextras.escola.classes;

import java.util.Scanner;

abstract public class Pessoa {
    private String nome;
    private String cpf;
    private String rg;
    private Endereco endereco;

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void inserirDadosCadastro() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome: ");
        this.nome = sc.nextLine();
        System.out.print("CPF: ");
        this.cpf = sc.nextLine();
        System.out.print("RG: ");
        this.rg = sc.nextLine();
    }

    public void imprimirDados(Pessoa pessoa) {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("RG: " + this.rg);
        System.out.println("Endereco: " + getEndereco().ImprimirEndereco());
    }

}
