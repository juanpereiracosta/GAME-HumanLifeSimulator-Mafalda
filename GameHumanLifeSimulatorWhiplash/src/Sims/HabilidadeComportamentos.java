package Sims;

import Pessoa.Jogador;

public class HabilidadeComportamentos {

    private Jogador mafalda;

    public HabilidadeComportamentos(Jogador mafalda) {
        this.mafalda = mafalda;
    }

    public void praticar() {
        mafalda.setSaude(mafalda.getSaude() + 10);
        mafalda.setDinheiro(mafalda.getDinheiro() - 10);
        mafalda.setHumor(mafalda.getHumor() + 20);
        mafalda.setHabilidade(mafalda.getHabilidade() + 150);
        mafalda.calcularEstatuto();
    }

    public void praticarEmExcesso() {
        mafalda.setSaude(mafalda.getSaude() - 60);
        mafalda.setDinheiro(mafalda.getDinheiro() - 20);
        mafalda.setHumor(mafalda.getHumor() - 20);
        mafalda.setHabilidade(mafalda.getHabilidade() + 180);
        mafalda.calcularEstatuto();
    }

    public void ensaiar() {
        mafalda.setSaude(mafalda.getSaude() + 10);
        mafalda.setDinheiro(mafalda.getDinheiro() - 10);
        mafalda.setHumor(mafalda.getHumor() + 10);
        mafalda.setHabilidade(mafalda.getHabilidade() + 180);
        mafalda.calcularEstatuto();
    }

    public void ensaiarEmExcesso() {
        mafalda.setSaude(mafalda.getSaude() - 40);
        mafalda.setDinheiro(mafalda.getDinheiro() - 20);
        mafalda.setHumor(mafalda.getHumor() - 20);
        mafalda.setHabilidade(mafalda.getHabilidade() + 190);
        mafalda.calcularEstatuto();
    }

    public void terAulaComFletcher() {
        mafalda.setSaude(mafalda.getSaude() - 10);
        mafalda.setDinheiro(mafalda.getDinheiro() - 60);
        mafalda.setHumor(mafalda.getHumor() + 10);
        mafalda.setHabilidade(mafalda.getHabilidade() + 190);
        mafalda.calcularEstatuto();
    }
}
