package Pessoa;

import Profissao.Profissao;

public class Npc extends Pessoa {

    private Profissao profissao;
    private int estatuto;

    /**
     * Método construtor para <b>Profissao</b>
     * @param nome
     */
    public Npc(String nome) {
        super(nome);
        this.estatuto = 0;
    }

    public int getEstatuto() {
        return estatuto;
    }

    public void setEstatuto(int estatuto) {
        this.estatuto = estatuto;
    }

    public String getNome() {
        return super.getNome();
    }
}
