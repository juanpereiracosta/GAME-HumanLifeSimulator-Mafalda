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
    private DinheiroComportamentos dinheiroComportamentos;
    private HabilidadeComportamentos habilidadeComportamentos;
    private HumorComportamentos humorComportamentos;
    private SaudeComportamentos saudeComportamentos;

    Scanner scanner = new Scanner(System.in);

    /**
     * Método construtor para <b>Sims</b>
     * @param jogador
     */
    public Sims(Jogador jogador) {
        this.jogador = jogador;

        // A instância de Eventos deve operar sobre a instância específica de Jogador que foi passada como parâmetro
        this.eventos = new Eventos(jogador);

        // this como parâmetro do tipo Sims parta evitar recursão infinita e conflita entre as instâncias
        this.habilidadeComportamentos = new HabilidadeComportamentos(jogador, this);
        this.dinheiroComportamentos = new DinheiroComportamentos(jogador, this); // Exemplo de inicialização
        this.humorComportamentos = new HumorComportamentos(jogador, this); // Exemplo de inicialização
        this.saudeComportamentos = new SaudeComportamentos(jogador, this); // Exemplo de inicialização

        profissoesDisponiveis = new ArrayList<>();
        instrumentosMusicais = new ArrayList<>();
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
        instrumentosMusicais.add("safoxone");
        instrumentosMusicais.add("piano");
        instrumentosMusicais.add("trompete");
        instrumentosMusicais.add("bateria");
        int index = 1;
        for (String instrumentoMusical : instrumentosMusicais) {
            System.out.println("[" + index + "] " + instrumentoMusical);
            index++;
        }
    }

    // Variáveis fora de métodos específicos para poderem ser utilizadas em mais de um método
    String nomePersonagemPrincipal;
    String nomeProfessor;
    String nomeAmigo;
    Profissao profissaoEscolhida;
    String instrumentoEscolhido;

     // Instância única de Scanner

    public void criarPessoa() {
        System.out.print("Escolha um nome: ");
        nomePersonagemPrincipal = scanner.nextLine();
        System.out.println();

        // Novo objeto Jogador usando o nome fornecido pelo usuário
        jogador = new Jogador(nomePersonagemPrincipal);

        System.out.println("Agora, escolha uma profissão para " + nomePersonagemPrincipal + ".");
        System.out.println("Lembrando que " + nomePersonagemPrincipal + " tem o sonho e objetivo de viver da música, " +
                "mas ainda precisa desempenhar funções em outras áreas até alcançar o sucesso...");
        System.out.println();
        System.out.println("Pensando nisto, escolha uma profissão digitando o número correspondente:");
        listarProfissoes();
        System.out.print("Digite aqui: ");
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
        limparTela();
        System.out.println("Chegou a hora de escolher qual instrumento " + nomePersonagemPrincipal + " tocará: ");
        listarInstrumentos();
        System.out.print("Digite aqui: ");
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
        String nomeNpc = scanner.nextLine();
        return nomeNpc;
    }

    public void exibirDetalhesPersonagemPrincipal() {
        System.out.println("********************************");
        System.out.println("*** Detalhes de " + nomePersonagemPrincipal + " ***");
        System.out.println("Nome: " + nomePersonagemPrincipal);
        System.out.println("Profissão: " + profissaoEscolhida);
        System.out.println("Objetivo: " + jogador.setObjetivo("Tocar na Casa da Música"));
        System.out.println("Terá aulas de " + instrumentoEscolhido + " com " + nomeProfessor);
        System.out.println("Pessoa favorita no mundo: " + nomeAmigo );
        System.out.println("********************************");
        System.out.println();
    }

    public void introJogo() {
        System.out.println("\n");
        System.out.println("*** Whiplash ***");
        System.out.println("\n");
        System.out.println("Pressione enter para continuar...");
        limparTela();
        System.out.println("Boas-Vindas!");
        System.out.println();
        System.out.println("Whiplash é um jogo em que o sucesso de uma pessoa na música depende de você...");
        limparTela();
        System.out.println("Deverá tomar decisões diárias que irão impactar o futuro musical dessa pessoa...");
        limparTela();
        System.out.println("Estamos falando de alguém que ama jazz e tem um objetivo de vida:");
        System.out.println();
        System.out.println("***********************");
        System.out.println();
        System.out.println("Tocar na Casa da Música");
        System.out.println();
        System.out.println("***********************");
        limparTela();
        System.out.println("Não é um objetivo fácil de se alcançar...");
        limparTela();
        System.out.println("Você terá 100 dias para realizar este objetivo e deverá tomar decisões diárias que irão " +
                "impactar em quatro fatores:");
        System.out.println();
        System.out.println("**********");
        System.out.println("Saúde");
        System.out.println("Humor");
        System.out.println("Habilidade");
        System.out.println("Dinheiro");
        System.out.println("**********");
        limparTela();
        System.out.println("O seu estatuto será gerado a partir da média destes quatro fatores.");
        System.out.println();
        System.out.println("Para cumprir o objetivo, deverá ter um estatuto acima de 150...");
        limparTela();
        System.out.println("Portanto, pense bem antes de cada decisão, ok?");
        limparTela();
        System.out.println("Algo pode render mais dinheiro, mas debilitar a saúde...");
        limparTela();
        System.out.println("Ou melhorar o humor, mas a um custo muito alto...");
        limparTela();
        System.out.println("Ou ainda aumentar o dinheiro e o humor, mas diminuir a habilidade musical...");
        limparTela();
        System.out.println("Já deu para perceber que cada decisão é muito importante, não é mesmo?");
        limparTela();
        System.out.println("Então, é hora de jogar!");
        limparTela();
        System.out.println("Antes de tudo, vamos criar nosso personagem...");
        limparTela();
        criarPessoa();
        System.out.println();
        System.out.println("Ótimo! Agora você precisa criar uma pessoa para dar aulas de " + instrumentoEscolhido +
                " para " + nomePersonagemPrincipal + ".");
        nomeProfessor = criarNpc();
        System.out.println();
        System.out.println("Legal, agora que " + nomePersonagemPrincipal + " terá aulas de " + instrumentoEscolhido +
                " com " + nomeProfessor + ", crie a pessoa favorita no mundo de " + nomePersonagemPrincipal + ".");
        System.out.println("Essa pessoa será importante para apoiar " + nomePersonagemPrincipal + " em busca de seu objetivo.");
        nomeAmigo = criarNpc();
        System.out.println("Agora " + nomePersonagemPrincipal + " pode contar com o apoio de " + nomeAmigo + "...");
        limparTela();
        System.out.println("Algumas situações ao longo da vida de " + nomePersonagemPrincipal + " terão a participação " +
                "de " + nomeAmigo + "...");
        limparTela();
        System.out.println("Muito bem, agora é hora de tomar decisões, divididas em quatro períodos de cada dia, manhã," +
                " almoço, tarde e noite, ao longo de 100 dias.");
        System.out.println();
        exibirDetalhesPersonagemPrincipal();
        limparTela();
        System.out.println("Boa sorte! " + nomePersonagemPrincipal + " conta com você para realizar seu objetivo.");
        System.out.println("********************************");
        System.out.println();
    }

    /**
     * Método com ciclos que representam os dias e meses que o personagem tem para cumprir os objetivos
     */
    public void jogo() {

        // Cada ciclo representa um dia
        for (int i = 1; i <= 100 ; i++) {
            System.out.println("**************");
            System.out.println("Dia " + i);
            System.out.println("***************");

            // Array com os quatro períodos do dia
            String[] periodosDoDia = {"manhã", "almoço", "tarde", "noite"};

            int periodoIndex = 0;

            while (periodoIndex < periodosDoDia.length) {
                String periodo = periodosDoDia[periodoIndex];

                System.out.println("Período: " + periodo);
                System.out.println("***************");

                // Colocar métodos para o jogador escolher
                if (periodo.equals("manhã")) {
                    System.out.println("Bom dia!");
                    System.out.println("O que " + nomePersonagemPrincipal + " fará primeiro hoje?");

                    System.out.println("[1] Praticar " + instrumentoEscolhido);
                    System.out.println("[2] Comprar um vinil de jazz");
                    System.out.println("[3] Ter aula");
                    System.out.println("[4] Tomar um café da manhã saudável");
                    System.out.println("[5] Comer uma junkie food");
                    System.out.println("[6] Encontrar " + nomeAmigo);
                    System.out.println("[7] Andar de bicicleta");
                    System.out.println("[8] Voltar a dormir");
                    System.out.println("[9] Tomar uma xícara de café");

                    System.out.print("Responda aqui: ");
                    int escolhaComportamentoManha = scanner.nextInt();

                    switch (escolhaComportamentoManha) {
                        case 1:
                            habilidadeComportamentos.praticar();
                            break;
                        case 2:
                            habilidadeComportamentos.comprarVinilDeJazz();
                            break;
                        case 3:
                            habilidadeComportamentos.terAula();
                            break;
                        case 4:
                            saudeComportamentos.comerComidaSaudavel();
                            break;
                        case 5:
                            humorComportamentos.comerJunkieFood();
                            break;
                        case 6:
                            humorComportamentos.encontrarPesssoaFavorita();
                            break;
                        case 7:
                            saudeComportamentos.andarDeBike();
                            break;
                        case 8:
                            saudeComportamentos.dormir();
                    }
                }

                if (periodo.equals("almoço")) {
                    System.out.println("Chegou a hora do almoço!");
                    System.out.println("O que " + nomePersonagemPrincipal + " fará agora?");

                    //Colocar métodos do almoço
                    System.out.println("[1] Comer uma comida saudável" + instrumentoEscolhido);
                    System.out.println("[2] Ouvir um vinil de jazz");
                    System.out.println("[3] Ter aula");
                    System.out.println("[4] Dormir um pouco");
                    System.out.println("[5] Comer uma junkie food");
                    System.out.println("[6] Almoçar com " + nomeAmigo);
                    System.out.println("[7] Andar de bicicleta");
                    System.out.println("[8] Trabalhar");
                    System.out.println("[9] Praticar");

                    System.out.print("Responda aqui: ");
                    int escolhaComportamentoManha = scanner.nextInt();

                    switch (escolhaComportamentoManha) {
                        case 1:
                            habilidadeComportamentos.praticar();
                            break;
                        case 2:
                            habilidadeComportamentos.comprarVinilDeJazz();
                    }
                }

                if (periodo.equals("tarde")) {
                    System.out.println("Hora de decidir como será a tarde de " + nomePersonagemPrincipal);

                    //Colocar métodos da tarde
                    System.out.println("[1] Fazer terapia");
                    System.out.println("[2] Dormir a sesta");
                    System.out.println("[3] Tomar xícara de café");
                    System.out.println("[4] Trabalhar");
                    System.out.println("[5] Comer uma junkie food");
                    System.out.println("[6] Sair com " + nomeAmigo);
                    System.out.println("[7] Andar de bicicleta");
                    System.out.println("[8] Beber taça de vinho");
                    System.out.println("[9] Praticar" + instrumentoEscolhido);
                    System.out.println("[10] Praticar em excesso");
                    System.out.println("[11] Ouvir vinil de Jazz");
                    System.out.println("[12] Ter aula com " + nomeProfessor);

                    System.out.print("Responda aqui: ");
                    int escolhaComportamentoManha = scanner.nextInt();

                    switch (escolhaComportamentoManha) {
                        case 1:
                            habilidadeComportamentos.praticar();
                            break;
                        case 2:
                            habilidadeComportamentos.comprarVinilDeJazz();
                    }
                }

                if (periodo.equals("noite")) {
                    System.out.println("Já é noite!");
                    System.out.println("O que " + nomePersonagemPrincipal + " fará antes de terminar o dia?");

                    //Colocar métodos da noite
                    System.out.println("[1] Fazer terapia");
                    System.out.println("[2] Dormir");
                    System.out.println("[3] Tomar xícara de café");
                    System.out.println("[4] Trabalhar");
                    System.out.println("[5] Fazer hora extra no trabalho");
                    System.out.println("[6] Tocar em um bar");
                    System.out.println("[7] Jantar uma junkie food");
                    System.out.println("[8] Jantar uma comida saudável");
                    System.out.println("[9] Sair com " + nomeAmigo);
                    System.out.println("[10] Andar de bicicleta");
                    System.out.println("[11] Beber taça de vinho");
                    System.out.println("[12] Praticar" + instrumentoEscolhido);
                    System.out.println("[13] Praticar em excesso");
                    System.out.println("[14] Ouvir vinil de Jazz");
                    System.out.println("[15] Ter aula com " + nomeProfessor);
                    System.out.println("[16] Assistir a um concerto de jazz");

                    System.out.print("Responda aqui: ");
                    int escolhaComportamentoManha = scanner.nextInt();

                    switch (escolhaComportamentoManha) {
                        case 1:
                            saudeComportamentos.fazerTerapia();
                            break;
                        case 2:
                            habilidadeComportamentos.comprarVinilDeJazz();
                    }
                }

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

