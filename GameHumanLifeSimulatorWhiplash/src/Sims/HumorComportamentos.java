package Sims;

import Pessoa.Jogador;
import Shopping.Vinho;
import Shopping.Vinil;

import java.util.ArrayList;
import java.util.Scanner;

public class HumorComportamentos {

    private Jogador jogador;
    private Sims sims;

    public HumorComportamentos(Jogador jogador, Sims sims) {
        this.jogador = jogador;
        this.sims = sims;
    }

    Scanner scanner = new Scanner(System.in);

    public void assistirConcerto() {
        System.out.println("Esse concerto de jazz irá melhorar o humor, a habilidade e até mesmo a " +
                "saúde de " + sims.nomePersonagemPrincipal + ".");
        System.out.println("Mas é claro que não saiu de graça.");
        System.out.println("Pense como um investimento, sem contar que isto também aumenta o estatuto de " +
                sims.nomeProfessor + ".");
        jogador.setHumor(jogador.getHumor() + 70);
        jogador.setSaude(jogador.getSaude() + 30);
        jogador.setDinheiro(jogador.getDinheiro() - 90);
        jogador.setHabilidade(jogador.getHabilidade() + 20);
        sims.nomeProfessor.setEstatuto(sims.nomeProfessor.getEstatuto() + 20);
        jogador.calcularEstatuto();
    }

    public void comerJunkieFood() {
        System.out.println("Às vezes, somente uma comida mais pesada para nos animar.");
        System.out.println("Mas atenção, cuidado com a saúde de " + sims.nomePersonagemPrincipal);
        jogador.setHumor(jogador.getHumor() + 120);
        jogador.setSaude(jogador.getSaude() - 50);
        jogador.setDinheiro(jogador.getDinheiro() - 80);
        jogador.setHabilidade(jogador.getHabilidade() - 10);
    }

    public void comprarVinho() {
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

        // Scanner para ler a entrada do usuário
        System.out.print("Digite o número do vinho que deseja comprar: ");
        int escolha = scanner.nextInt();

        // Variável para armazenar o vinil escolhido pelo jogador
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
                return; // Sai do método se a escolha for inválida
        }

        // Exibe o vinil escolhido
        if (vinhoEscolhido != null) {
            System.out.println(vinhoEscolhido + " é muito saboroso!");
            System.out.println("Boa escolha, uma taça de " + vinhoEscolhido + " fará bem a " + sims.nomePersonagemPrincipal + ".");
            System.out.println("Ah, não se esqueça de sempre prestar atenção no seu dinheiro, ok?");
        }

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
