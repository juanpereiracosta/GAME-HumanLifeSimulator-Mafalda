package Sims;

import Pessoa.Jogador;

public class HumorComportamentos {

    private Jogador jogador;
    private Sims sims;

    public HumorComportamentos(Jogador jogador, Sims sims) {
        this.jogador = jogador;
        this.sims = sims;
    }

    public void assistirConcerto() {
        jogador.setHumor(jogador.getHumor() + 70);
        jogador.setSaude(jogador.getSaude() + 30);
        jogador.setDinheiro(jogador.getDinheiro() - 90);
        jogador.setHabilidade(jogador.getHabilidade() + 20);
    }

    public void comerJunkieFood() {
        System.out.println("Às vezes, somente uma comida mais pesada para nos animar.");
        System.out.println("Mas atenção, cuidado com a saúde de " + sims.nomePersonagemPrincipal);
        jogador.setHumor(jogador.getHumor() + 120);
        jogador.setSaude(jogador.getSaude() - 50);
        jogador.setDinheiro(jogador.getDinheiro() - 80);
        jogador.setHabilidade(jogador.getHabilidade() - 10);
    }

    public void beberTacaDeVinho() {
        jogador.setHumor(jogador.getHumor() + 180);
        jogador.setSaude(jogador.getSaude() - 50);
        jogador.setDinheiro(jogador.getDinheiro() - 50);
        jogador.setHabilidade(jogador.getHabilidade() - 20);
    }

    public void encontrarPesssoaFavorita() {
        System.out.println("Encontrar uma pessoa querida sempre melhora nossa saúde e nosso humor.");
        System.out.println("Por isso, será muito bom para " + sims.nomePersonagemPrincipal + " encontrar " + sims.nomeAmigo + ".          ");
        System.out.println("Lembrando que o estatuto de " + sims.nomeAmigo + " deve estar acima de 150.");
        sims.nomeAmigo.setEstatuto(sims.nomeAmigo.getEstatuto() + 20);
        jogador.setHumor(jogador.getHumor() + 200);
        jogador.setSaude(jogador.getSaude() + 50);
        jogador.setDinheiro(jogador.getDinheiro() - 50);
        jogador.setHabilidade(jogador.getHabilidade() - 30);
    }
}
