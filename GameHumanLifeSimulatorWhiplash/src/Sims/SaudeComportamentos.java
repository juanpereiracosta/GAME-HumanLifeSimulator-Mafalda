package Sims;

import Pessoa.Mafalda;

public class SaudeComportamentos {

    Mafalda mafalda;

    public SaudeComportamentos(Mafalda mafalda) {
        this.mafalda = mafalda;
    }

    public void andarDeBike() {
        mafalda.setSaude(mafalda.getSaude() + 50);
        mafalda.setDinheiro(mafalda.getDinheiro() - 20);
        mafalda.setHumor(mafalda.getHumor() + 50);
        mafalda.setHabilidade(mafalda.getHabilidade() - 10);
        mafalda.calcularEstatuto();
    }

    public void comerComidaSaudavel() {
        mafalda.setSaude(mafalda.getSaude() + 70);
        mafalda.setDinheiro(mafalda.getDinheiro() - 30);
        mafalda.setHumor(mafalda.getHumor() + 20);
        mafalda.setHabilidade(mafalda.getHabilidade() - 5);
        mafalda.calcularEstatuto();
    }

    public void fazerTerapia() {
        mafalda.setSaude(mafalda.getSaude() + 60);
        mafalda.setDinheiro(mafalda.getDinheiro() - 40);
        mafalda.setHumor(mafalda.getHumor() + 10);
        mafalda.setHabilidade(mafalda.getHabilidade() - 10);
        mafalda.calcularEstatuto();
    }

    public void dormir() {
        mafalda.setSaude(mafalda.getSaude() + 70);
        mafalda.setDinheiro(mafalda.getDinheiro() - 40);
        mafalda.setHumor(mafalda.getHumor() + 40);
        mafalda.setHabilidade(mafalda.getHabilidade() - 10);
        mafalda.calcularEstatuto();
    }
}
