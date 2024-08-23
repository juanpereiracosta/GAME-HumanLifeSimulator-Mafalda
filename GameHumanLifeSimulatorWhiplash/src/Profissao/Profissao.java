package Profissao;

public class Profissao {

    private String nome;
    private double salarioHora;
    private boolean formal;

    /**
     * Método construtor para <b>Profissao</b>
     * @param nome
     * @param salarioHora
     * @param formal
     */

    public Profissao(String nome, double salarioHora, boolean formal) {
        this.nome = nome;
        this.salarioHora = salarioHora;
        this.formal = formal;
    }

    /**
     * Método subscrito que retorna as informações de <b>Profissao</b>
     * @return informações da classe Profissao
     */
    @Override
    public String toString() {
        String varFormal;
        if (formal) {
            varFormal = "Sim";
        } else {
            varFormal = "Não";
        }
        return "Nome: " + nome + ", Salário por Hora: " + salarioHora + ", Formal: " + varFormal;
    }

}
