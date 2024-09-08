package Sims;

import Pessoa.Jogador;

public class DinheiroComportamentos {

    private Jogador jogador;
    private Sims sims;

    /**
     * Método construtor para <b>DinheiroComportamentos</b>
     * @param jogador
     * @param sims
     */
    public DinheiroComportamentos(Jogador jogador, Sims sims) {
        this.jogador = jogador;
        this.sims = sims;
    }

    /**
     * Método que faz o personagem trabalhar
     */
    public void trabalhar() {
        System.out.println();
        System.out.println("*****************************");
        System.out.println("Hora de ganhar um dinheirinho! Afinal, até " + sims.nomePersonagemPrincipal + " alcançar " +
                "seu objetivo, as contas não serão pagas sozinhas.");
        System.out.println("*****************************");
        System.out.println();
        jogador.setHumor(jogador.getHumor() - 30);
        jogador.setDinheiro(jogador.getDinheiro() + 50);
        jogador.calcularEstatuto();
        sims.estatutoProfessorEAmigo();
    }

    /**
     * Método que faz o personagem fazer hora extra no trabalho
     */
    public void fazerHoraExtra() {
        System.out.println();
        System.out.println("*****************************");
        System.out.println("Sempre bom ter um ganho de dinheiro a mais!");
        System.out.println("Apenas tome cuidado com a saúde, humor e habilidade musical de "
                + sims.nomePersonagemPrincipal + " ok?");
        System.out.println("*****************************");
        System.out.println();
        jogador.setHumor(jogador.getHumor() - 20);
        jogador.setSaude(jogador.getSaude() - 20);
        jogador.setDinheiro(jogador.getDinheiro() + 60);
        jogador.calcularEstatuto();
        sims.estatutoProfessorEAmigo();
    }

    /**
     * Método que faz o personagem tocar em um bar como renda extra
     */
    public void tocarEmBar() {
        System.out.println();
        System.out.println("*****************************");
        System.out.println("Para complementar a renda, é bom que " + sims.nomePersonagemPrincipal + " toque em um bar de " +
                " vez em quando.");
        System.out.println("Apenas leve em conta que isso aumenta seu dinheiro e sua habilidade, mas compromete sua saúde" +
                " e seu humor.");
        System.out.println("*****************************");
        System.out.println();
        jogador.setHumor(jogador.getHumor() - 20);
        jogador.setSaude(jogador.getSaude() - 20);
        jogador.setDinheiro(jogador.getDinheiro() + 60);
        jogador.setHabilidade(jogador.getHabilidade() + 10);
        jogador.calcularEstatuto();
        sims.estatutoProfessorEAmigo();
    }
}
