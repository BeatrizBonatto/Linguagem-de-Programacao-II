package edu.fatec.lp2.exercicio1;

public class Contatinho {
    private String nome;
    private String celular;

    public Contatinho(String celular, String nome) {
        this.celular = celular;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}