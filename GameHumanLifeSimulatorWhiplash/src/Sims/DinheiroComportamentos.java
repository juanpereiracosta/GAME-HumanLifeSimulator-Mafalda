package Sims;

import Pessoa.Jogador;

public class DinheiroComportamentos {

    private Jogador jogador;
    private Sims sims;

    public DinheiroComportamentos(Jogador jogador, Sims sims) {
        this.jogador = jogador;
        this.sims = sims;
    }

    public void trabalhar() {
        System.out.println("Trabalhar como " + sims.profissaoEscolhida + " não dá muito dinheiro, mas é necessário!");
        jogador.setHumor(jogador.getHumor() - 70);
        jogador.setSaude(jogador.getSaude() - 60);
        jogador.setDinheiro(jogador.getDinheiro() + 150);
        jogador.setHabilidade(jogador.getHabilidade() - 10);
        jogador.calcularEstatuto();
    }

    public void fazerHoraExtra() {
        jogador.setHumor(jogador.getHumor() - 80);
        jogador.setSaude(jogador.getSaude() - 80);
        jogador.setDinheiro(jogador.getDinheiro() + 200);
        jogador.setHabilidade(jogador.getHabilidade() - 40);
        jogador.calcularEstatuto();
    }

    public void tocarEmBar() {
        jogador.setHumor(jogador.getHumor() + 50);
        jogador.setSaude(jogador.getSaude() - 70);
        jogador.setDinheiro(jogador.getDinheiro() + 150);
        jogador.setHabilidade(jogador.getHabilidade() - 30);
        jogador.calcularEstatuto();
    }


}
