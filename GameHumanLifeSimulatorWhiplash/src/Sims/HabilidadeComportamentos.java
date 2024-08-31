package Sims;

import Pessoa.Jogador;

public class HabilidadeComportamentos {

    private Jogador jogador;

    public HabilidadeComportamentos(Jogador jogador) {
        this.jogador = jogador;
    }

    public void praticar() {
        jogador.setSaude(jogador.getSaude() + 10);
        jogador.setDinheiro(jogador.getDinheiro() - 10);
        jogador.setHumor(jogador.getHumor() + 20);
        jogador.setHabilidade(jogador.getHabilidade() + 150);
        jogador.calcularEstatuto();
    }

    public void praticarEmExcesso() {
        jogador.setSaude(jogador.getSaude() - 10);
        jogador.setDinheiro(jogador.getDinheiro() - 20);
        jogador.setHumor(jogador.getHumor() - 10);
        jogador.setHabilidade(jogador.getHabilidade() + 200);
        jogador.calcularEstatuto();
    }

    public void ouvirVinilDeJazz() {
        jogador.setSaude(jogador.getSaude() + 10);
        jogador.setDinheiro(jogador.getDinheiro() - 10);
        jogador.setHumor(jogador.getHumor() + 10);
        jogador.setHabilidade(jogador.getHabilidade() + 100);
        jogador.calcularEstatuto();
    }

    public void terAula() {
        jogador.setSaude(jogador.getSaude() - 10);
        jogador.setDinheiro(jogador.getDinheiro() - 60);
        jogador.setHumor(jogador.getHumor() + 10);
        jogador.setHabilidade(jogador.getHabilidade() + 190);
        jogador.calcularEstatuto();
    }
}
