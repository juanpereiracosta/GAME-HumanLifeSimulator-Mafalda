package Sims;

import Pessoa.Jogador;
import Shopping.Vinho;
import Shopping.Vinil;

import java.util.ArrayList;
import java.util.Scanner;

public class HumorComportamentos {

    private Jogador jogador;
    private Sims sims;

    /**
     * Método construtor para <b>HumorComportamentos</b>
     * @param jogador
     * @param sims
     */
    public HumorComportamentos(Jogador jogador, Sims sims) {
        this.jogador = jogador;
        this.sims = sims;
    }

    Scanner scanner = new Scanner(System.in);

    /**
     * Método que faz o personagem assistir a um concerto de jazz
     */
    public void assistirConcerto() {
        System.out.println();
        System.out.println("*****************************");
        System.out.println("Esse concerto de jazz irá melhorar o humor, a habilidade e até mesmo a " +
                "saúde de " + sims.nomePersonagemPrincipal + ".");
        System.out.println("Mas é claro que não saiu de graça.");
        System.out.println("Pense como um investimento, sem contar que isto também aumenta o estatuto de " +
                sims.nomeProfessor + ".");
        System.out.println("*****************************");
        System.out.println();
        jogador.setHumor(jogador.getHumor() + 50);
        jogador.setSaude(jogador.getSaude() + 20);
        jogador.setDinheiro(jogador.getDinheiro() - 50);
        jogador.setHabilidade(jogador.getHabilidade() + 20);
        sims.nomeProfessor.setEstatuto(sims.nomeProfessor.getEstatuto() + 50);
        sims.nomeAmigo.setEstatuto(sims.nomeAmigo.getEstatuto());
        jogador.calcularEstatuto();
        sims.estatutoProfessorEAmigo();
    }

    /**
     * Método que faz o personagem comer uma junkie food
     */
    public void comerJunkieFood() {
        System.out.println();
        System.out.println("*****************************");
        System.out.println("Às vezes, somente uma comida mais pesada para nos animar.");
        System.out.println("Mas tenha cuidado com a saúde de " + sims.nomePersonagemPrincipal + ", ok?");
        System.out.println("*****************************");
        System.out.println();
        jogador.setHumor(jogador.getHumor() + 50);
        jogador.setSaude(jogador.getSaude() - 10);
        jogador.setDinheiro(jogador.getDinheiro() - 10);
        jogador.calcularEstatuto();
        sims.estatutoProfessorEAmigo();
    }

    /**
     * Método que faz o personagem escolher um vinho para comprar
     */
    public void comprarVinho() {
        System.out.println();
        System.out.println("*****************************");
        ArrayList<Vinho> listaVinhos = new ArrayList<>();

        listaVinhos.add(Vinho.VINHO_VERDE);
        listaVinhos.add(Vinho.VINHO_BRANCO);
        listaVinhos.add(Vinho.VINHO_TINTO);
        listaVinhos.add(Vinho.VINHO_ROSE);

        System.out.println("Escolha um vinho para comprar:");

        int index = 1;
        for (Vinho vinho : listaVinhos) {
            System.out.println("[" + index + "] " + vinho);
            index++;
        }

        System.out.print("Digite o número do vinho que deseja comprar: ");
        int escolha = scanner.nextInt();

        Vinho vinhoEscolhido = null;

        switch (escolha) {
            case 1:
                vinhoEscolhido = Vinho.VINHO_VERDE;
                break;
            case 2:
                vinhoEscolhido = Vinho.VINHO_BRANCO;
                break;
            case 3:
                vinhoEscolhido = Vinho.VINHO_TINTO;
                break;
            case 4:
                vinhoEscolhido = Vinho.VINHO_ROSE;
                break;
            default:
                System.out.println("Escolha inválida. Por favor, escolha um número de 1 a " + listaVinhos.size());
                return;
        }

        if (vinhoEscolhido != null) {
            System.out.println("*****************************");
            System.out.println("Boa escolha! Uma taça de " + vinhoEscolhido + " fará bem a " + sims.nomePersonagemPrincipal + ".");
            System.out.println("Ah, não se esqueça de sempre prestar atenção no seu dinheiro, ok?");
        }
        System.out.println("*****************************");
        System.out.println();
        jogador.setHumor(jogador.getHumor() + 50);
        jogador.setSaude(jogador.getSaude() + 10);
        jogador.setDinheiro(jogador.getDinheiro() - 20);
        jogador.setHabilidade(jogador.getHabilidade() + 20);
        jogador.calcularEstatuto();
        sims.estatutoProfessorEAmigo();
    }

    /**
     * Método que faz o personagem encontrar seu amigo
     */
    public void encontrarPesssoaFavorita() {
        System.out.println();
        System.out.println("*****************************");
        System.out.println("Encontrar uma pessoa querida sempre melhora nossa saúde e nosso humor.");
        System.out.println("Por isso, será muito bom para " + sims.nomePersonagemPrincipal + " encontrar " + sims.nomeAmigo + ".          ");
        System.out.println("Lembrando que o estatuto de " + sims.nomeAmigo + " aumenta a cada encontro.");
        System.out.println("*****************************");
        System.out.println();
        jogador.setHumor(jogador.getHumor() + 50);
        jogador.setSaude(jogador.getSaude() + 20);
        sims.nomeAmigo.setEstatuto(sims.nomeAmigo.getEstatuto() + 50);
        jogador.calcularEstatuto();
        sims.estatutoProfessorEAmigo();
    }
}
