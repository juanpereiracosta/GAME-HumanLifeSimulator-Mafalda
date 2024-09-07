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
        System.out.println("**********************");
        System.out.println("O tempo mudou e " + sims.nomePersonagemPrincipal + " pegou um resfriado.");
        System.out.println("Por conta disso, sua saúde foi afetada.");
        jogador.setSaude(jogador.getSaude() - 50);
        jogador.calcularEstatuto();
        sims.estatutoProfessorEAmigo();
    }

    public void quedaBicicleta() {
        System.out.println("**********************");
        System.out.println("Ao andar de bicicleta, " + sims.nomePersonagemPrincipal + " teve um pequeno acidente.");
        System.out.println("Está tudo bem!");
        System.out.println("Porém, houve uma pequena torção no pulso que afetará sua saúde e sua habilidade.");
        jogador.setSaude(jogador.getSaude() - 50);
        jogador.setHumor(jogador.getHumor() - 50);
        jogador.setHabilidade(jogador.getHabilidade() - 10);
        jogador.calcularEstatuto();
        sims.estatutoProfessorEAmigo();
    }

    public void insonia() {
        System.out.println("**********************");
        System.out.println("Essa não foi uma boa noite de sono para " + sims.nomePersonagemPrincipal);
        System.out.println("Sua saúde foi um pouco prejudicada.");
        jogador.setSaude(jogador.getSaude() - 50);
        jogador.setHumor(jogador.getHumor() - 50);
        jogador.setHabilidade(jogador.getHabilidade() - 10);
        jogador.calcularEstatuto();
        sims.estatutoProfessorEAmigo();
    }

    public void bloqueioCriativo() {
        System.out.println("**********************");
        System.out.println(sims.nomePersonagemPrincipal + " não está com inspiração hoje.");
        System.out.println("Sua habilidade diminuiu um pouco.");
        System.out.println("Talvez dormir um pouco ou andar de bicicleta possa ajudar.");
        jogador.setHumor(jogador.getHumor() - 20);
        jogador.setHabilidade(jogador.getHabilidade() - 40);
        jogador.calcularEstatuto();
        sims.estatutoProfessorEAmigo();
    }

    public void tocarEmCasamento() {
        System.out.println("**********************");
        System.out.println("Surgiu uma oportunidade para " + sims.nomePersonagemPrincipal + " tocar em um casamento.");
        System.out.println("Não é lá o melhor trabalho do mundo, mas é um dinheiro a mais.");
        jogador.setDinheiro(jogador.getDinheiro() + 50);
        jogador.setHabilidade(jogador.getHabilidade() + 30);
        jogador.calcularEstatuto();
        sims.estatutoProfessorEAmigo();
    }

    public void discussaoComProfessor() {
        System.out.println("**********************");
        System.out.println("Infelizmente, " + sims.nomePersonagemPrincipal + " teve uma pequena discussão com ." +
                sims.nomeProfessor + ".");
        System.out.println("Isso é normal quando se está estudando um instrumento, ainda mais se tratando de " +
                sims.instrumentoEscolhido);
        System.out.println("Por conta disso, a habilidade e humor de " + sims.nomePersonagemPrincipal + " diminuíram um " +
                "pouco," + " assim como o estatuto de " + sims.nomeProfessor + ".");
        jogador.setHumor(jogador.getHumor() - 50);
        jogador.setHabilidade(jogador.getHabilidade() - 50);
        jogador.calcularEstatuto();
        sims.nomeProfessor.setEstatuto(sims.nomeProfessor.getEstatuto() - 50);
        sims.nomeAmigo.setEstatuto(sims.nomeAmigo.getEstatuto());
        jogador.calcularEstatuto();
        sims.estatutoProfessorEAmigo();
    }

    public void discussaoComAmigo() {
        System.out.println("**********************");
        System.out.println("Dessa vez, " + sims.nomePersonagemPrincipal + " acabou brigando com " +
                sims.nomeAmigo + ".");
        System.out.println("Parece que " + sims.nomePersonagemPrincipal + " votou no Bloco de Esquerda e " +
                sims.nomeAmigo + " no CHEGA.");
        System.out.println("Por conta disso, o humor de " + sims.nomePersonagemPrincipal + " diminuiu um pouco," +
                " assim como o estatuto de " + sims.nomeAmigo + ".");
        jogador.setHumor(jogador.getHumor() - 50);
        jogador.calcularEstatuto();
        sims.nomeProfessor.setEstatuto(sims.nomeProfessor.getEstatuto() - 50);
        sims.nomeAmigo.setEstatuto(sims.nomeAmigo.getEstatuto());
        jogador.calcularEstatuto();
        sims.estatutoProfessorEAmigo();
    }

    public void diaDeSorte() {
        System.out.println("**********************");
        System.out.println("Hoje é o dia da sorte!");
        System.out.println(sims.nomePersonagemPrincipal + " estava andando pela rua e encontrou algum dinheiro.");
        jogador.setDinheiro(jogador.getDinheiro() + 50);
        jogador.calcularEstatuto();
        jogador.calcularEstatuto();
        sims.estatutoProfessorEAmigo();
    }

    public void visitaDaMae() {
        System.out.println("**********************");
        System.out.println(sims.nomePersonagemPrincipal + " recebeu uma visita inesperada da mãe. Isso melhorou seu " +
                " humor e até mesmo a sua saúde.");
        jogador.setHumor(jogador.getHumor() + 50);
        jogador.calcularEstatuto();
        sims.estatutoProfessorEAmigo();
    }

    public void instrumentoAvariado() {
        System.out.println("**********************");
        System.out.println("Parece que o " + sims.instrumentoEscolhido + " está com um pequeno defeito.");
        System.out.println("Por conta disto, a habilidade, o dinheiro e o humor de " + sims.nomePersonagemPrincipal +
                " serão afetados, assim como o estatuto de " + sims.nomeProfessor + ".");
        jogador.setHumor(jogador.getHumor() - 70);
        jogador.setDinheiro(jogador.getDinheiro() - 90);
        jogador.setHabilidade(jogador.getHabilidade() - 80);
        sims.nomeProfessor.setEstatuto(sims.nomeProfessor.getEstatuto() - 50);
        jogador.calcularEstatuto();
        sims.estatutoProfessorEAmigo();
    }

    public void prendadoAmigo() {
        System.out.println("**********************");
        System.out.println("Dessa vez, que resolveu fazer uma surpresa para " + sims.nomePersonagemPrincipal +
                " foi "+ sims.nomeAmigo + "com uma prenda especial: um box com os melhores anos de John Coltrane!");
        System.out.println("Isto melhorou o humor de " + sims.nomePersonagemPrincipal + " e aumentou o estatuto de " +
                sims.nomeAmigo + ".");
        jogador.setHumor(jogador.getHumor() + 50);
        sims.nomeAmigo.setEstatuto(sims.nomeAmigo.getEstatuto() + 50);
        jogador.calcularEstatuto();
        sims.estatutoProfessorEAmigo();
    }

}


