package Pessoa;

import Profissao.Profissao;

public class Pessoa {

    private String nome;
    private Profissao profissao;
    int estatuto;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
