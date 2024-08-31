package Sims;

import Pessoa.Jogador;

public class SaudeComportamentos {

    private Jogador jogador;

    public SaudeComportamentos(Jogador jogador) {
        this.jogador = jogador;
    }

    public void andarDeBike() {
        jogador.setSaude(jogador.getSaude() + 120);
        jogador.setDinheiro(jogador.getDinheiro() - 10);
        jogador.setHumor(jogador.getHumor() + 70);
        jogador.setHabilidade(jogador.getHabilidade() - 10);
        jogador.calcularEstatuto();
    }

    public void comerComidaSaudavel() {
        jogador.setSaude(jogador.getSaude() + 150);
        jogador.setDinheiro(jogador.getDinheiro() - 30);
        jogador.setHumor(jogador.getHumor() + 50);
        jogador.setHabilidade(jogador.getHabilidade() - 10);
        jogador.calcularEstatuto();
    }

    public void fazerTerapia() {
        jogador.setSaude(jogador.getSaude() + 160);
        jogador.setDinheiro(jogador.getDinheiro() - 80);
        jogador.setHumor(jogador.getHumor() + 80);
        jogador.setHabilidade(jogador.getHabilidade() - 10);
        jogador.calcularEstatuto();
    }

    public void dormir() {
        jogador.setSaude(jogador.getSaude() + 150);
        jogador.setDinheiro(jogador.getDinheiro() - 10);
        jogador.setHumor(jogador.getHumor() + 60);
        jogador.setHabilidade(jogador.getHabilidade() - 10);
        jogador.calcularEstatuto();
    }

    public void tomarCafe() {
        jogador.setSaude(jogador.getSaude() - 30);
        jogador.setDinheiro(jogador.getDinheiro() - 10);
        jogador.setHumor(jogador.getHumor() + 100);
        jogador.setHabilidade(jogador.getHabilidade() + 20);
        jogador.calcularEstatuto();
    }
}
