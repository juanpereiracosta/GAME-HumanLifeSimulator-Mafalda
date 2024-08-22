package Pessoa;

import java.util.ArrayList;

public class Fletcher extends Pessoa {

    private Profissao profissao;
    private int necessidadeRefeicao;
    private int estatuto;

    public Fletcher(String nome, double dinheiro) {
        super(nome, dinheiro);
    }

    public Fletcher(String nome, double dinheiro, Profissao profissao, int necessidadeRefeicao, int estatuto) {
        super(nome, dinheiro);
        this.profissao = profissao;
        this.necessidadeRefeicao = necessidadeRefeicao;
        this.estatuto = estatuto;
    }
}

