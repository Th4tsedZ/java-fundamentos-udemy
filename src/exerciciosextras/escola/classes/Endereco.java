package exerciciosextras.escola.classes;

import java.util.Scanner;

public class Endereco {
    private String rua;
    private String bairro;
    private String complemento;
    private String cidade;
    private String estado;
    private String pais;

    public Endereco(String rua, String bairro, String complemento, String cidade, String estado, String pais) {
        this.rua = rua;
        this.bairro = bairro;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }

    public Endereco(String rua, String bairro, String cidade, String estado, String pais) {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }

    public Endereco() {
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void inserirEndereco() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rua: ");
        this.rua = sc.nextLine();
        System.out.print("Bairro: ");
        this.bairro = sc.nextLine();
        System.out.print("Complemento: ");
        this.complemento = sc.nextLine();
        System.out.print("Cidade: ");
        this.cidade = sc.nextLine();
        System.out.print("Estado: ");
        this.estado = sc.nextLine();
        System.out.print("País: ");
        this.pais = sc.nextLine();
    }

    public String ImprimirEndereco() {
        return  this.rua + ", " + this.bairro + ", " + this.cidade + ", " + this.estado + ", " + this.pais;
    }
}
