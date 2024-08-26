package Sims;

import Pessoa.Mafalda;

public class SaudeComportamentos {

    private Mafalda mafalda;

    public SaudeComportamentos(Mafalda mafalda) {
        this.mafalda = mafalda;
    }

    public void andarDeBike() {
        mafalda.setSaude(mafalda.getSaude() + 80);
        mafalda.setDinheiro(mafalda.getDinheiro() - 10);
        mafalda.setHumor(mafalda.getHumor() + 70);
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
        mafalda.setSaude(mafalda.getSaude() + 90);
        mafalda.setDinheiro(mafalda.getDinheiro() - 80);
        mafalda.setHumor(mafalda.getHumor() + 80);
        mafalda.setHabilidade(mafalda.getHabilidade() - 10);
        mafalda.calcularEstatuto();
    }

    public void dormir() {
        mafalda.setSaude(mafalda.getSaude() + 70);
        mafalda.setDinheiro(mafalda.getDinheiro() - 20);
        mafalda.setHumor(mafalda.getHumor() + 40);
        mafalda.setHabilidade(mafalda.getHabilidade() - 20);
        mafalda.calcularEstatuto();
    }

}
