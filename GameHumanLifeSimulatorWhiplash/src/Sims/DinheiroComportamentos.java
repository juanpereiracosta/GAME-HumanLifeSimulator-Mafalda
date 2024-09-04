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
        System.out.println("Hora de ganhar um dinheirinho! Afinal, até " + sims.nomePersonagemPrincipal + " alcançar " +
                "seu objetivo, as contas não serão pagas sozinhas.");
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
        System.out.println("Para complementar a renda, é bom que " + sims.nomePersonagemPrincipal + " toque em um bar de " +
                " vez em quando.");
        System.out.println("Apenas leve em conta que isso aumenta seu dinheiro e sua habilidade, mas compromete sua saúde" +
                " e seu humor");
        jogador.setHumor(jogador.getHumor() - 50);
        jogador.setSaude(jogador.getSaude() - 70);
        jogador.setDinheiro(jogador.getDinheiro() + 150);
        jogador.setHabilidade(jogador.getHabilidade() + 30);
        jogador.calcularEstatuto();
    }
}
