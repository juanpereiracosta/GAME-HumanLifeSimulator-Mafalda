package Pessoa;

import Profissao.Profissao;

public class Npc extends Pessoa {
    public Npc(String nome) {
        super(nome);
    }

    private Profissao profissao;
    private int estatuto;
}
