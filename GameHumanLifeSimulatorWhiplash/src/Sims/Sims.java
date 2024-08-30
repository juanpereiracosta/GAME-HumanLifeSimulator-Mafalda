package Sims;

import Pessoa.Jogador;
import Pessoa.Npc;
import Profissao.Profissao;

import java.util.ArrayList;
import java.util.Scanner;

public class Sims {

    private Jogador jogador;
    private Eventos eventos;
    private ArrayList<Profissao> profissoesDisponiveis;
    private ArrayList<String> instrumentosMusicais;

    /**
     * Método construtor para <b>Sims</b>
     * @param jogador
     */
    public Sims(Jogador jogador) {
        this.jogador = jogador;

        // A instância de Eventos deve operar sobre a instância específica de Mafalda que foi passada como parâmetro
        this.eventos = new Eventos(jogador);

        profissoesDisponiveis = new ArrayList<>();
        instrumentosMusicais = new ArrayList<>();
    }

    public void enter() {
        System.out.println("\n");
        System.out.println("Enter...");
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

    public void listarInstrumentos() {
        instrumentosMusicais.add("Safoxone");
        instrumentosMusicais.add("Piano");
        instrumentosMusicais.add("Trompete");
        instrumentosMusicais.add("Bateria");
        int index = 1;
        for (String instrumentoMusical : instrumentosMusicais) {
            System.out.println("[" + index + "] " + instrumentoMusical);
            index++;
        }
    }

    private Scanner scanner = new Scanner(System.in);
    // Variáveis fora de métodos específicos para poderem ser utilizadas em mais de um método
    String nomePersonagemPrincipal;
    String nomeProfessor;
    String nomeAmigo;
    Profissao profissaoEscolhida;
    String instrumentoEscolhido;

     // Instância única de Scanner

    public void criarPessoa() {
        System.out.println("Qual será o nome dela?");
        System.out.print("Responda aqui: ");
        nomePersonagemPrincipal = scanner.nextLine();  // Lê o nome fornecido pelo usuário

        // Novo objeto Jogador usando o nome fornecido pelo usuário
        jogador = new Jogador(nomePersonagemPrincipal);

        System.out.println("Chegou a hora de escolher uma profissão para " + nomePersonagemPrincipal + ".");
        System.out.println("Lembrando que " + nomePersonagemPrincipal + " tem o sonho e objetivo de viver da música, mas ainda precisa desempenhar funções em outras áreas até alcançar o sucesso.");
        System.out.println("Pensando nisto, escolha uma profissão digitando o número correspondente:");
        listarProfissoes();
        int profissaoEscolhidaIndex = scanner.nextInt();
        scanner.nextLine();

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
        enter();
        limparTela();
        System.out.println("Agora escolha qual instrumento seu personagem tocará: ");
        listarInstrumentos();
        int instrumentoEscolhidoIndex = scanner.nextInt();
        scanner.nextLine();
        switch (instrumentoEscolhidoIndex) {
            case 1:
                instrumentoEscolhido = instrumentosMusicais.get(0);
                break;
            case 2:
                instrumentoEscolhido = instrumentosMusicais.get(1);
                break;
            case 3:
                instrumentoEscolhido = instrumentosMusicais.get(2);
                break;
            case 4:
                instrumentoEscolhido = instrumentosMusicais.get(3);
                break;
            default:
                System.out.println("Escolha inválida. Por favor, escolha um número de 1 a 4");
                return;
        }
    }

    public String criarNpc() {
        System.out.print("Escolha um nome: ");
        String nomeNpc = scanner.nextLine();  // Lê o nome fornecido pelo usuário
        return nomeNpc;  // Retorna o nome para ser armazenado em uma variável específica
    }

    public void exibirDetalhesPersonagemPrincipal() {
        System.out.println("********************************");
        System.out.println("*** Detalhes de " + nomePersonagemPrincipal + " ***");
        System.out.println("Nome: " + nomePersonagemPrincipal);
        System.out.println("Profissão: " + profissaoEscolhida);
        System.out.println("Objetivo: " + jogador.setObjetivo("Tocar na Casa da Música"));
        System.out.println("Nome do professor de " + instrumentoEscolhido + ": " + nomeProfessor);
        System.out.println("Pessoa favorita no mundo: " + nomeAmigo );
        System.out.println("********************************");
        System.out.println();
    }

    public void introJogo() {
        System.out.println("*** Whiplash ***");
        System.out.println("\n");
        System.out.println("Pressione enter para continuar...");
        limparTela();
        System.out.println("Boas-Vindas!");
        System.out.println();
        System.out.println("Whiplash é um jogo em que o sucesso de uma pessoa na música depende de você...");
        limparTela();
        System.out.println("Deverá tomar decisões que irão impactar o futuro musical dessa pessoa...");
        limparTela();
        System.out.println("Estamos falando de alguém que ama jazz e tem um objetivo de vida:");
        System.out.println("***********************");
        System.out.println("Tocar na Casa da Música");
        System.out.println("***********************");
        limparTela();
        System.out.println("Não é um objetivo fácil de se alcançar...");
        limparTela();
        System.out.println("Você terá 100 dias para realizar este objetivo e deverá tomar decisões diárias que irão " +
                "impactar em quatro fatores:");
        System.out.println("**********");
        System.out.println("Saúde");
        System.out.println("Humor");
        System.out.println("Habilidade");
        System.out.println("Dinheiro");
        System.out.println("**********");
        enter();
        limparTela();
        System.out.println("O seu estatuto será gerado a partir da média destes quatro fatores.");
        System.out.println("Para cumprir o objetivo, deverá ter um estatuto acima de 150...");
        limparTela();
        System.out.println("Portanto, pense bem antes de cada decisão, ok?");
        enter();
        limparTela();
        System.out.println("Algo pode render mais dinheiro, mas debilitar a saúde...");
        limparTela();
        System.out.println("Ou melhorar o humor, mas a um custo muito alto...");
        limparTela();
        System.out.println("Ou ainda aumentar o dinheiro e humor, mas diminuir a habilidade musical...");
        limparTela();
        System.out.println("Já deu para perceber que cada decisão é muito importante, não é mesmo?!");
        enter();
        limparTela();
        System.out.println("Então, é hora de jogar!");
        enter();
        limparTela();
        System.out.println("Antes de tudo, vamos criar nosso personagem...");
        limparTela();
        criarPessoa();
        System.out.println("Ótimo! Agora você precisa criar um professor para " + nomePersonagemPrincipal + ".");
        nomeProfessor = criarNpc();
        System.out.println("Legal, agora que " + nomePersonagemPrincipal + " terá aulas com " + nomeProfessor + ", crie " +
                "a pessoa favorita no mundo de " + nomePersonagemPrincipal + ".");
        System.out.println("Essa pessoa será importante para apoiar " + nomePersonagemPrincipal + " em busca do seu objetivo.");
        nomeAmigo = criarNpc();
        System.out.println("Agora " + nomePersonagemPrincipal + " pode contar com " + nomeAmigo);
        System.out.println("Algumas situações ao longo da vida de " + nomePersonagemPrincipal + " terão a participação de " + nomeAmigo + ".");
        limparTela();
        System.out.println("Muito bem, agora é hora de tomar decisões ao longo de 100 dias.");
        exibirDetalhesPersonagemPrincipal();
        System.out.println();
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

