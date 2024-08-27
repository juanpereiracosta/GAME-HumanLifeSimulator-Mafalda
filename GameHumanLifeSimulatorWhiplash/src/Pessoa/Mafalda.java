package Pessoa;

import Objetivo.Objetivo;
import Profissao.Profissao;

public class Mafalda extends Pessoa {

    private Profissao profissao;
    private Objetivo objetivoAtual;
    private int estatuto;
    private int saude;
    private int humor;
    private int habilidade;
    private int dinheiro;

    /**
     * Método construtor para <b>Mafalda</b> com atributo da superclasse <b>Pessoa</b>
     * @param nome
     */
    public Mafalda(String nome) {
        super(nome);
    }

    /**
     * Método construtor com o atributo e parâmetro da superclasse e os atributos e nomes da classe Mafalda
     * @param nome
     * @param profissao
     * @param objetivoAtual
     */
    public Mafalda(String nome, Profissao profissao, Objetivo objetivoAtual) {
        super(nome);
        this.profissao = profissao;
        this.estatuto = 0;
        this.saude = 0;
        this.humor = 0;
        this.habilidade = 0;
        this.dinheiro = 0;
        this.objetivoAtual = objetivoAtual;
    }

    public int getEstatuto() {
        return estatuto;
    }

    public int getSaude() {
        return saude;
    }

    public int getHumor() {
        return humor;
    }

    public int getHabilidade() {
        return habilidade;
    }

    public int getDinheiro() {
        return dinheiro;
    }

    public void setSaude(int saude) {
        this.saude = saude;
    }

    public void setHumor(int humor) {
        this.humor = humor;
    }

    public void setHabilidade(int habilidade) {
        this.habilidade = habilidade;
    }

    public void setDinheiro(int dinheiro) {
        this.dinheiro = dinheiro;
    }

    /**
     * Método que exibe os detalhes de <b>Mafalda</b> e <b>Profissao</b>
     */
    public void exibirDetalhes() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Profissão: " + profissao);
        System.out.println("Objetivo atual: " + objetivoAtual);
        calcularEstatuto();
        System.out.println("********************************");
        System.out.println();
    }

    public void calcularEstatuto() {
        estatuto = saude + humor + habilidade + dinheiro / 4;
        System.out.println("Estatuto atual de Mafalda: " + estatuto);
    }
}

