package Sims;

import Pessoa.Mafalda;

public class DinheiroComportamentos {

    private Mafalda mafalda;

    public DinheiroComportamentos(Mafalda mafalda) {
        this.mafalda = mafalda;
    }

    public void trabalharPorHoraComoGarconete() {
        mafalda.setHumor(mafalda.getHumor() - 70);
        mafalda.setSaude(mafalda.getSaude() - 60);
        mafalda.setDinheiro(mafalda.getDinheiro() + 150);
        mafalda.setHabilidade(mafalda.getHabilidade() - 10);
    }

    public void fazerHoraExtracomoGarconete() {
        mafalda.setHumor(mafalda.getHumor() - 80);
        mafalda.setSaude(mafalda.getSaude() - 70);
        mafalda.setDinheiro(mafalda.getDinheiro() + 200);
        mafalda.setHabilidade(mafalda.getHabilidade() - 40);
    }

    public void discotecar() {
        mafalda.setHumor(mafalda.getHumor() + 50);
        mafalda.setSaude(mafalda.getSaude() - 70);
        mafalda.setDinheiro(mafalda.getDinheiro() + 150);
        mafalda.setHabilidade(mafalda.getHabilidade() - 30);
    }

    public void fazerApresentacaoLocal() {
        mafalda.setHumor(mafalda.getHumor() + 50);
        mafalda.setSaude(mafalda.getSaude() - 80);
        mafalda.setDinheiro(mafalda.getDinheiro() + 200);
        mafalda.setHabilidade(mafalda.getHabilidade() + 70);
    }
}
