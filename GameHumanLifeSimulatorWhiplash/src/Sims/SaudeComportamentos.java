package Sims;

import Pessoa.Jogador;

public class SaudeComportamentos {

    private Jogador jogador;
    private Sims sims;

    /**
     * Método construtor para <b>SaudeComportamentos</b>
     * @param jogador
     * @param sims
     */
    public SaudeComportamentos(Jogador jogador, Sims sims) {
        this.jogador = jogador;
        this.sims = sims;
    }

    /**
     * Método que faz o personagem andar de bicicleta
     */
    public void andarDeBike() {
        System.out.println();
        System.out.println("*****************************");
        System.out.println("Sentir o ventinho no rosto em cima de uma bicicleta é uma sensação deliciosa.");
        System.out.println("Certamente um passeio de bike fará muito bem a " + sims.nomePersonagemPrincipal + ".");
        System.out.println("*****************************");
        System.out.println();
        jogador.setSaude(jogador.getSaude() + 40);
        jogador.setHumor(jogador.getHumor() + 40);
        jogador.calcularEstatuto();
        sims.estatutoProfessorEAmigo();
    }

    /**
     * Método que faz o personagem comer comida saudável
     */
    public void comerComidaSaudavel() {
        System.out.println();
        System.out.println("*****************************");
        System.out.println("Uma refeição nutritiva é importante para manter a saúde de " + sims.nomePersonagemPrincipal +
                " em dia.");
        System.out.println("*****************************");
        System.out.println();
        jogador.setSaude(jogador.getSaude() + 50);
        jogador.calcularEstatuto();
        sims.estatutoProfessorEAmigo();
    }

    /**
     * Método que faz o personagem fazer terapia
     */
    public void fazerTerapia() {
        System.out.println();
        System.out.println("*****************************");
        System.out.println("Terapia é muito importante para a saúde e até mesmo para o humor.");
        System.out.println("Mesmo sendo um bom investimento no autocuidado, preste atenção no dinheiro de " +
                sims.nomePersonagemPrincipal + ".");
        System.out.println("*****************************");
        System.out.println();
        jogador.setSaude(jogador.getSaude() + 60);
        jogador.setDinheiro(jogador.getDinheiro() - 20);
        jogador.setHumor(jogador.getHumor() + 30);
        jogador.calcularEstatuto();
        sims.estatutoProfessorEAmigo();
    }

    /**
     * Método que faz o personagem dormir
     */
    public void dormir() {
        System.out.println();
        System.out.println("*****************************");
        System.out.println("Dormir é muito importante para a saúde e ainda melhora o humor.");
        System.out.println("Apenas tome cuidado para dispor de um tempinho para outras atividades importantes, ok?");
        System.out.println("*****************************");
        System.out.println();
        jogador.setSaude(jogador.getSaude() + 50);
        jogador.setHumor(jogador.getHumor() + 30);
        jogador.calcularEstatuto();
        sims.estatutoProfessorEAmigo();
    }

    /**
     * Método que faz o personagem tomar café
     */
    public void tomarCafe() {
        System.out.println();
        System.out.println("*****************************");
        System.out.println("Nada como um cafezinho para dar aquele up!");
        System.out.println("Apenas preste atenção para não prejudicar a saúde de " + sims.nomePersonagemPrincipal + ", " +
                " tudo bem?");
        System.out.println("*****************************");
        System.out.println();
        jogador.setSaude(jogador.getSaude() - 10);
        jogador.setHumor(jogador.getHumor() + 30);
        jogador.calcularEstatuto();
        sims.estatutoProfessorEAmigo();
    }
}
