package Sims;

import Pessoa.Jogador;

public class HumorComportamentos {

    private Jogador mafalda;

    public HumorComportamentos(Jogador mafalda) {
        this.mafalda = mafalda;
    }

    public void assistirConcerto() {
        mafalda.setHumor(mafalda.getHumor() + 70);
        mafalda.setSaude(mafalda.getSaude() + 30);
        mafalda.setDinheiro(mafalda.getDinheiro() - 90);
        mafalda.setHabilidade(mafalda.getHabilidade() + 20);
    }

    public void comerJunkieFood() {
        mafalda.setHumor(mafalda.getHumor() + 120);
        mafalda.setSaude(mafalda.getSaude() - 50);
        mafalda.setDinheiro(mafalda.getDinheiro() - 80);
        mafalda.setHabilidade(mafalda.getHabilidade() - 10);
    }

    public void beberTacaDeVinho() {
        mafalda.setHumor(mafalda.getHumor() + 80);
        mafalda.setSaude(mafalda.getSaude() - 50);
        mafalda.setDinheiro(mafalda.getDinheiro() - 50);
        mafalda.setHabilidade(mafalda.getHabilidade() - 20);
    }
}
