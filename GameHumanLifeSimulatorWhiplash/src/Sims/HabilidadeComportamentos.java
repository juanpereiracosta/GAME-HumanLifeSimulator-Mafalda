package Sims;

import Pessoa.Jogador;
import Shopping.Vinil;

import java.util.ArrayList;
import java.util.Scanner;

public class HabilidadeComportamentos {

    private Jogador jogador;
    private Sims sims;

    public HabilidadeComportamentos(Jogador jogador, Sims sims) {
        this.jogador = jogador;
        this.sims = sims;
    }

    Scanner scanner = new Scanner(System.in);

    public void praticar() {
        System.out.println("Muito bem! " + sims.nomePersonagemPrincipal + " só tocará na Casa da Música se praticar muito.");
        jogador.setSaude(jogador.getSaude() + 10);
        jogador.setDinheiro(jogador.getDinheiro() - 10);
        jogador.setHumor(jogador.getHumor() + 20);
        jogador.setHabilidade(jogador.getHabilidade() + 150);
        jogador.calcularEstatuto();
    }

    public void praticarEmExcesso() {
        jogador.setSaude(jogador.getSaude() - 10);
        jogador.setDinheiro(jogador.getDinheiro() - 20);
        jogador.setHumor(jogador.getHumor() - 10);
        jogador.setHabilidade(jogador.getHabilidade() + 200);
        jogador.calcularEstatuto();
    }

    public void comprarVinilDeJazz() {
        ArrayList<Vinil> listaVinis = new ArrayList<>();

        listaVinis.add(Vinil.JOHN_COLTRANE);
        listaVinis.add(Vinil.MILES_DAVIS);
        listaVinis.add(Vinil.CHARLIE_PARKER);
        listaVinis.add(Vinil.BILLIE_HOLIDAY);

        System.out.println("Escolha um vinil para comprar:");

        int index = 1;
        for (Vinil vinil : listaVinis) {
            System.out.println("[" + index + "] " + vinil);
            index++;
        }

        // Scanner para ler a entrada do usuário
        System.out.print("Digite o número do vinil que deseja comprar: ");
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

        jogador.setSaude(jogador.getSaude() + 10);
        jogador.setDinheiro(jogador.getDinheiro() - 10);
        jogador.setHumor(jogador.getHumor() + 10);
        jogador.setHabilidade(jogador.getHabilidade() + 100);
        jogador.calcularEstatuto();
    }

    public void terAula() {
        jogador.setSaude(jogador.getSaude() - 10);
        jogador.setDinheiro(jogador.getDinheiro() - 60);
        jogador.setHumor(jogador.getHumor() + 10);
        jogador.setHabilidade(jogador.getHabilidade() + 190);
        jogador.calcularEstatuto();
    }
}
