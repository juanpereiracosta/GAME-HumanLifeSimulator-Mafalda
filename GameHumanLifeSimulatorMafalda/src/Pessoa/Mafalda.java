package Pessoa;

import java.util.ArrayList;

public class Mafalda extends Pessoa {

    private Objetivo objetivoVida;
    private Profissao profissao;
    private int necessidadeRefeicao;
    private int estatuto;
    private int educacao;
    private ArrayList<Profissao> propriedades;
    private ArrayList<Npc> familia;

    public Mafalda(String nome, double dinheiro) {
        super(nome, dinheiro);
    }

    public Mafalda(String nome, double dinheiro, Objetivo objetivoVida, Profissao profissao, int necessidadeRefeicao,
                   int estatuto, int educacao, ArrayList<Profissao> propriedades, ArrayList<Npc> familia) {
        super(nome, dinheiro);
        this.objetivoVida = objetivoVida;
        this.profissao = profissao;
        this.necessidadeRefeicao = necessidadeRefeicao;
        this.estatuto = estatuto;
        this.educacao = educacao;
        this.propriedades = propriedades;
        this.familia = familia;
    }
}
