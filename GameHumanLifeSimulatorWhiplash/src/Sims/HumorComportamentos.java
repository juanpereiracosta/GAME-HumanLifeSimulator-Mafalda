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
        Vinil vinilEscolhido = null;

        switch (escolha) {
            case 1:
                vinilEscolhido = Vinil.JOHN_COLTRANE;
                break;
            case 2:
                vinilEscolhido = Vinil.MILES_DAVIS;
                break;
            case 3:
                vinilEscolhido = Vinil.CHARLIE_PARKER;
                break;
            case 4:
                vinilEscolhido = Vinil.BILLIE_HOLIDAY;
                break;
            default:
                System.out.println("Escolha inválida. Por favor, escolha um número de 1 a " + listaVinis.size());
                return; // Sai do método se a escolha for inválida
        }

        // Exibe o vinil escolhido
        if (vinilEscolhido != null) {
            System.out.println(vinilEscolhido + " é uma ótima escolha!");
            System.out.println("Certamenmte " + sims.nomePersonagemPrincipal + " fará bom proveito.");
            System.out.println("Ah, não se esqueça de prestar atenção no seu dinheiro sempre que comprar algo, ok?");
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
