package Pessoa;

import Profissao.Profissao;
import Sims.Sims;

public class Jogador extends Pessoa {

    private String objetivo;
    private int saude;
    private int humor;
    private int habilidade;
    private int dinheiro;
    private Sims sims;

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
     * @param sims
     */
    public Jogador(String nome, Profissao profissao, String objetivo, Sims sims) {
        super(nome);
        this.estatuto = 0;
        this.saude = 0;
        this.humor = 0;
        this.habilidade = 0;
        this.dinheiro = 0;
        this.objetivo = objetivo;
        this.sims = sims;
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

    /**
     * Método que calcula o estatuto do personagem
     */
    public void calcularEstatuto() {
        System.out.println("**********************");
        System.out.println("Saúde: " + saude);
        System.out.println("Humor: " + humor);
        System.out.println("Dinheiro: " + dinheiro);
        System.out.println("Habilidade: " + habilidade);
        estatuto = saude + humor + habilidade + dinheiro / 4;
        System.out.println("**********************");
        System.out.println("Estatuto atual: " + estatuto);
        System.out.println("**********************");
    }
}
