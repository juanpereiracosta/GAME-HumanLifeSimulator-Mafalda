package Sims;

import Pessoa.Jogador;

public class Eventos {

    private Jogador jogador;
    private Sims sims;

    public Eventos(Jogador jogador, Sims sims) {
        this.jogador = jogador;
        //A instância de Sims é passada para que método resfriado() acesse detalhes de Sims, como nomePersonagemPrincipal.
        this.sims = sims;
    }

    public void resfriado() {
        System.out.println("************************");
        System.out.println("O tempo mudou e " + sims.nomePersonagemPrincipal + " pegou um resfriado.");
        System.out.println("Por conta disso, sua saúde foi afetada.");
        jogador.setSaude(jogador.getSaude() - 70);
        jogador.calcularEstatuto();
    }

    public void quedaBicicleta() {
        System.out.println("************************");
        System.out.println("Ao andar de bicicleta, " + sims.nomePersonagemPrincipal + " teve um pequeno acidente.");
        System.out.println("Está tudo bem!");
        System.out.println("Porém, houve uma pequena torção no pulso que afetará sua saúde e sua habilidade.");
        jogador.setSaude(jogador.getSaude() - 30);
        jogador.setHabilidade(jogador.getHabilidade() - 40);
        jogador.calcularEstatuto();
    }

    public void insonia() {
        System.out.println("************************");
        System.out.println("Essa não foi uma boa noite de sono para " + sims.nomePersonagemPrincipal);
        System.out.println("Sua saúde foi um pouco prejudicada.");
        jogador.setSaude(jogador.getSaude() - 40);
    }

    public void bloqueioCriativo() {
        System.out.println("************************");
        System.out.println(sims.nomePersonagemPrincipal + " não está com inspiração hoje.");
        System.out.println("Sua habilidade diminuiu um pouco.");
        System.out.println("Talvez dormir um pouco ou andar de bicicleta possa ajudar.");
    }

    public void tocarEmCasamento() {
        System.out.println("Surgiu uma oportunidade para " + sims.nomePersonagemPrincipal + " tocar em um casamento.");
        System.out.println("Não é lá o melhor trabalho do mundo, mas é um dinheiro a mais.");
        jogador.setHumor(jogador.getHumor() - 50);
        jogador.setSaude(jogador.getSaude() - 80);
        jogador.setDinheiro(jogador.getDinheiro() + 200);
        jogador.setHabilidade(jogador.getHabilidade() + 70);
        jogador.calcularEstatuto();
    }
}
