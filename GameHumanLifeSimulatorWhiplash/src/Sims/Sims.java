package Sims;

import Pessoa.Jogador;
import Profissao.Profissao;

import java.util.ArrayList;
import java.util.Scanner;

public class Sims {

    Scanner scanner = new Scanner(System.in);

    private Jogador jogador;
    private Eventos eventos;
    private ArrayList<Profissao> profissoesDisponiveis;

    public void enter() {
        System.out.println("\n");
        System.out.println("Enter...");
    }

    /**
     * Método construtor para <b>Sims</b>
     * @param mafalda
     */
    public Sims(Jogador mafalda) {
        this.jogador = mafalda;

        // A instância de Eventos deve operar sobre a instância específica de Mafalda que foi passada como parâmetro
        this.eventos = new Eventos(mafalda);

        profissoesDisponiveis = new ArrayList<>();
    }

    public void limparTela() {
        scanner.nextLine();  // Aguarda o usuário pressionar Enter
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void listarProfissoes() {

        profissoesDisponiveis.add(new Profissao("Atendente de mesa", 10, false));
        profissoesDisponiveis.add(new Profissao("Atendente de livraria", 10, false));
        profissoesDisponiveis.add(new Profissao("Guia de turismo", 10, false));
        profissoesDisponiveis.add(new Profissao("Dogwalker", 10, false));
        int index = 1;
        for (Profissao profissaoDisponivel : profissoesDisponiveis) {
            System.out.println("[" + index + "] " + profissaoDisponivel);
            index++;
        }
    }
    // Variável fora de métodos específicos para poder ser utilizada em mais de um método
    String nomePersonagemPrincipal = scanner.nextLine();
    public void criarPessoa() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual será o nome dela?");
        System.out.print("Responda aqui: ");

        // Novo objeto Jogador usando o nome fornecido pelo usuário
        jogador = new Jogador(nomePersonagemPrincipal);

        System.out.println("Legal. Agora escolha uma profissão para " + nomePersonagemPrincipal + ".");
        System.out.println("Lembrando que " + nomePersonagemPrincipal + " tem o sonho e objetivo de viver da música, mas ainda precisa desempenhar funções em outras áreas até alcançar o sucesso.");
        System.out.println("Pensando nisto, escolha uma profissão digitando o número correspondente:");

        listarProfissoes();

        int profissaoEscolhidaIndex = scanner.nextInt();
        Profissao profissaoEscolhida;

        switch (profissaoEscolhidaIndex) {
            case 1:
                profissaoEscolhida = profissoesDisponiveis.get(0);
                break;
            case 2:
                profissaoEscolhida = profissoesDisponiveis.get(1);
                break;
            case 3:
                profissaoEscolhida = profissoesDisponiveis.get(2);
                break;
            case 4:
                profissaoEscolhida = profissoesDisponiveis.get(3);
                break;
            default:
                System.out.println("Escolha inválida. Por favor, escolha um número de 1 a 4");
                return;
        }
        System.out.println("Você escolheu a profissão: " + profissaoEscolhida);
        scanner.close();
    }

   public void introJogo() {
       System.out.println("*** Whiplash ***");
       System.out.println("\n");
       System.out.println("Pressione enter para continuar...");
       limparTela();
       System.out.println("Boas-Vindas!");
       enter();
       limparTela();
       System.out.println("Whiplash é um jogo em que o sucesso de uma pessoa na música depende de você!");
       limparTela();
       System.out.println("Você deverá tomar decisões que irão impactar o futuro musical dessa pessoa.");
       limparTela();
       System.out.println("Estamos falando de alguém que ama jazz e tem 4 objetivos de vida:");
       System.out.println("1 - Comprar um instrumento musical");
       System.out.println("2 - Entrar para o Conservatório de Música do Porto");
       System.out.println("3 - Entrar para um grupo de jazz");
       System.out.println("4 - Tocar na Casa da Música com seu novo grupo");
       limparTela();
       System.out.println("Você terá um mês para cumprir cada objetivo, tomando decisões diárias que irão impactar em:");
       System.out.println("Saúde");
       System.out.println("Humor");
       System.out.println("Habilidade");
       System.out.println("Dinheiro");
       limparTela();
       System.out.println("O seu estatuto será gerado a partir de uma média desses quatro itens.");
       System.out.println("Para cumprir cada objetivo, você deverá ter um estatuto acima de 150.");
       limparTela();
       System.out.println("Portanto, pense bem antes de cada decisão, ok?");
       limparTela();
       System.out.println("Imagine que algo pode render mais dinheiro, mas debilitar a saúde.");
       System.out.println("Ou uma decisão é capaz de melhorar o humor, mas o custo pode ser alto.");
       System.out.println("Ou, ainda, o humor pode melhorar, o dinheiro aumentar, mas a habilidade musical diminuir.");
       limparTela();
       System.out.println("Já deu para perceber que cada decisão é muito importante, não é mesmo?");
       limparTela();
       System.out.println("Então, é hora de jogar!");
       limparTela();
       System.out.println("Antes de tudo, vamos criar a nossa pessoa musicista.");
       limparTela();
       criarPessoa();
       System.out.println("Ótimo! Agora você precisa criar um professor para " + nomePersonagemPrincipal + ".");
        //criarNpc("Professor");  // Método genérico para criar um NPC, neste caso, o professor

       System.out.println("Legal, agora que " + nomePersonagemPrincipal + " tem um professor, crie uma melhor amiga para fazer companhia a " + jogador.getNome() + ".");
        //criarNpc("Amiga");  // Método genérico para criar um NPC, neste caso, a amiga

       System.out.println("Legal, agora é hora de tomar decisões ao longo de 4 meses, tendo um mês para cumprir cada objetivo.");
       //jogo();  // Método principal do jogo
    }

    /**
     * Método com ciclos que representam os dias e meses que o personagem tem para cumprir os objetivos
     */
    public void jogo() {

        // Cada ciclo representa um dia, sendo 30 ciclos um mês
        for (int i = 1; i <= 30 ; i++) {
            System.out.println("Dia " + i + " do mês");

            // Array com os quatro períodos do dia
            String[] periodosDoDia = {"manhã", "almoço", "tarde", "noite"};
            int periodoIndex = 0;

            while (periodoIndex < periodosDoDia.length) {
                String periodo = periodosDoDia[periodoIndex];

                System.out.println("Período: " + periodo);
                // Colocar métodos para o jogador escolher

                // No 4º dia do mês ou seja, i = 4, Mafalda tem um resfriado
                if (i == 4 && periodo.equals("manhã")) {
                    eventos.resfriado();
                }

                // No 7º dia do mês ou seja, i = 7, Mafalda cai de bicicleta
                if (i == 7 && periodo.equals("tarde")) {
                    eventos.quedaBicicleta();
                }
                periodoIndex++;
            }
        }
    }
}

