package Sims;

import Pessoa.Jogador;

public class SaudeComportamentos {

    private Jogador jogador;
    private Sims sims;

    public SaudeComportamentos(Jogador jogador, Sims sims) {
        this.jogador = jogador;
        this.sims = sims;
    }

    public void andarDeBike() {
        System.out.println();
        System.out.println("*****************************");
        System.out.println("Sentir o ventinho no rosto em cima de uma bicicleta é uma sensação deliciosa.");
        System.out.println("Certamente um passeio de bike fará muito bem a " + sims.nomePersonagemPrincipal + ".");
        System.out.println("*****************************");
        System.out.println();
        jogador.setSaude(jogador.getSaude() + 120);
        jogador.setDinheiro(jogador.getDinheiro() - 10);
        jogador.setHumor(jogador.getHumor() + 70);
        jogador.setHabilidade(jogador.getHabilidade() - 10);
        jogador.calcularEstatuto();
        sims.estatutoProfessorEAmigo();
    }

    public void comerComidaSaudavel() {
        System.out.println();
        System.out.println("*****************************");
        System.out.println("Uma refeição nutritiva logo cedo pode ajudar " + sims.nomePersonagemPrincipal + " a ter um" +
                " bom dia pela frente.");
        System.out.println("*****************************");
        System.out.println();
        jogador.setSaude(jogador.getSaude() + 150);
        jogador.setDinheiro(jogador.getDinheiro() - 30);
        jogador.setHumor(jogador.getHumor() + 50);
        jogador.setHabilidade(jogador.getHabilidade() - 10);
        jogador.calcularEstatuto();
        sims.estatutoProfessorEAmigo();
    }

    public void fazerTerapia() {
        System.out.println();
        System.out.println("*****************************");
        System.out.println("Terapia é muito importante para a saúde e até mesmo para o humor.");
        System.out.println("Mesmo sendo um bom investimento no autocuidado, preste atenção no dinheiro de " +
                sims.nomePersonagemPrincipal + ".");
        System.out.println("*****************************");
        System.out.println();
        jogador.setSaude(jogador.getSaude() + 160);
        jogador.setDinheiro(jogador.getDinheiro() - 80);
        jogador.setHumor(jogador.getHumor() + 80);
        jogador.setHabilidade(jogador.getHabilidade() - 10);
        jogador.calcularEstatuto();
        sims.estatutoProfessorEAmigo();
    }

    public void dormir() {
        System.out.println();
        System.out.println("*****************************");
        System.out.println("Dormir é sempre bom para a saúde e ainda melhora o humor.");
        System.out.println("Apenas tome cuidado para dispor de um tempinho para outras atividades importantes, ok?");
        System.out.println("*****************************");
        System.out.println();
        jogador.setSaude(jogador.getSaude() + 150);
        jogador.setDinheiro(jogador.getDinheiro() - 10);
        jogador.setHumor(jogador.getHumor() + 60);
        jogador.setHabilidade(jogador.getHabilidade() - 10);
        jogador.calcularEstatuto();
        sims.estatutoProfessorEAmigo();
    }

    public void tomarCafe() {
        System.out.println();
        System.out.println("*****************************");
        System.out.println("Nada como um cafezinho para dar aquele up!");
        System.out.println("Apenas preste atenção para não prejudicar a saúde de " + sims.nomePersonagemPrincipal + ", " +
                " tudo bem?");
        System.out.println("*****************************");
        System.out.println();
        jogador.setSaude(jogador.getSaude() - 30);
        jogador.setDinheiro(jogador.getDinheiro() - 10);
        jogador.setHumor(jogador.getHumor() + 100);
        jogador.setHabilidade(jogador.getHabilidade() + 20);
        jogador.calcularEstatuto();
        sims.estatutoProfessorEAmigo();
    }
}
