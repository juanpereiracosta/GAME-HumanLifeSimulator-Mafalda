package Pessoa;

import Profissao.Profissao;

public class Jogador extends Pessoa {


    private String objetivo;
    private int saude;
    private int humor;
    private int habilidade;
    private int dinheiro;

    /**
     * Método construtor para <b>Jogador</b> com atributo e parâmetro da superclasse <b>Pessoa</b>
     * @param nome
     */
    public Jogador(String nome) {
        super(nome);
    }

    /**
     * Método construtor para <b>Jogador</b> com atributos e parâmetros específicos
     * @param nome
     * @param profissao
     * @param objetivo
     */
    public Jogador(String nome, Profissao profissao, String objetivo) {
        super(nome);
        this.estatuto = 0;
        this.saude = 0;
        this.humor = 0;
        this.habilidade = 0;
        this.dinheiro = 0;
        this.objetivo = objetivo;
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

    public String setObjetivo(String objetivo) {
        this.objetivo = objetivo;
        return objetivo;
    }

    public void calcularEstatuto() {
        estatuto = saude + humor + habilidade + dinheiro / 4;
        System.out.println("Estatuto atual de Mafalda: " + estatuto);
    }
}

