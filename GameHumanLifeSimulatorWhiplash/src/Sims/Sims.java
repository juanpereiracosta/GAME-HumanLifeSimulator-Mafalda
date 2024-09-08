package Sims;

import Pessoa.Jogador;
import Pessoa.Npc;
import Profissao.Profissao;
import com.sun.security.jgss.GSSUtil;
import org.w3c.dom.ls.LSOutput;
import java.sql.SQLOutput;
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
        this.eventos = new Eventos(jogador, this);

        /* this como parâmetro do tipo Sims para evitar recursão infinita e conflito entre as instâncias
        Pelo que entendi, é como se a o código dissesse "é ESTE o parâmetro que deve ser levado em conta. Dessa forma,
        não há conflito entre instâncias. */
        this.habilidadeComportamentos = new HabilidadeComportamentos(jogador, this);
        this.dinheiroComportamentos = new DinheiroComportamentos(jogador, this);
        this.humorComportamentos = new HumorComportamentos(jogador, this);
        this.saudeComportamentos = new SaudeComportamentos(jogador, this);

        profissoesDisponiveis = new ArrayList<>();
        instrumentosMusicais = new ArrayList<>();
    }

    /**
     * Método que limpa a tela da consola
     */
    public void limparTela() {
        scanner.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    /**
     * Método que lista opções de profissões
     */
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

    /**
     * Método que lista opções de instrumentos musicais
     */
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
    Npc nomeProfessor;
    Npc nomeAmigo;
    Profissao profissaoEscolhida;
    String instrumentoEscolhido;

    /**
     * Método para criar uma pessoa
     */
    public void criarPessoa() {
        System.out.print("Escolha um nome: ");
        nomePersonagemPrincipal = scanner.nextLine();
        System.out.println();

        /* Novo objeto Jogador que tem o nome fornecido pelo utilizador como parâmetro, armazenado na variável
        nomePersonagemPrincipal */
        jogador = new Jogador(nomePersonagemPrincipal);

        System.out.println("Agora, escolha uma profissão para " + nomePersonagemPrincipal + ".");
        System.out.println("Lembrando que " + nomePersonagemPrincipal + " tem o sonho e objetivo de viver da música, " +
                "mas ainda precisa desempenhar funções em outras áreas até alcançar o sucesso.");
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

    /**
     * Método para criar um Npc
     * @return nome do Npc armazenado na variável nomeNpc que é parâmetro do objeto do tipo Npc
     */
    public Npc criarNpc() {
        System.out.print("Escolha um nome: ");
        String nomeNpc = scanner.nextLine();
        return new Npc(nomeNpc);
    }

    /**
     * Método que exibe os detalhes do personagem principal
     */
    public void exibirDetalhesPersonagemPrincipal() {
        System.out.println("********************************");
        System.out.println("*** Detalhes de " + nomePersonagemPrincipal + " ***");
        System.out.println("Nome: " + nomePersonagemPrincipal);
        System.out.println("Profissão: " + profissaoEscolhida);
        System.out.println("Objetivo: " + jogador.setObjetivo("Tocar na Casa da Música"));
        System.out.println("Terá aulas de " + instrumentoEscolhido + " com " + nomeProfessor);
        System.out.println("Pessoa favorita no mundo: " + nomeAmigo );
        System.out.println("********************************");
    }

    /**
     * Método para calcular o estatuto
     */
    public void estatutoProfessorEAmigo() {
        System.out.println("Estatuto de " + nomeProfessor + ": " + (nomeProfessor.getEstatuto()));
        System.out.println("**********************");
        System.out.println("Estatuto de " + nomeAmigo + ": " + (nomeAmigo.getEstatuto()));
    }

    /**
     * Método com a introdução do jogo
     */
    public void introJogo() {
        System.out.println("\n");
        System.out.println("         ******           ");
        System.out.println("     ***************     ");
        System.out.println(" ********      ********* ");
        System.out.println("********        *********");
        System.out.println("******  WHIPLASH  *******");
        System.out.println("*********      **********");
        System.out.println("**********    ***********");
        System.out.println("     ***************     ");
        System.out.println("         ******           ");
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
        System.out.println("Tocar na Casa da Música");
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
        System.out.println("O seu estatuto será gerado a partir da média destes quatro fatores. Ao final do jogo, " +
                "nenhum deles pode estar negativo.");
        System.out.println();
        System.out.println("Para cumprir o objetivo, deverá ter um estatuto acima de 5500...");
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
        System.out.println("Legal, então " + nomePersonagemPrincipal + " terá aulas de " + instrumentoEscolhido +
                " com " + nomeProfessor + "." );
        System.out.println("Alguns comportamentos de " + nomePersonagemPrincipal + " irão interferir no" +
                " estatuto de " + nomeProfessor + ".");
        System.out.println("Por isso, preste atenção neste detalhe, pois para que " + nomePersonagemPrincipal + " cumpra seu" +
                " objetivo, " + nomeProfessor + " precisa ter um estatuto acima de 2000.");
        limparTela();
        System.out.println("Agora, crie a pessoa favorita no mundo de " + nomePersonagemPrincipal + ".");
        System.out.println("Essa pessoa será importante para apoiar " + nomePersonagemPrincipal + " em busca de seu objetivo.");
        nomeAmigo = criarNpc();
        limparTela();
        System.out.println("Daqui em diante, " + nomePersonagemPrincipal + " poderá contar com o apoio de " + nomeAmigo + "...");
        limparTela();
        System.out.println("Algumas situações ao longo da vida de " + nomePersonagemPrincipal + " terão a participação " +
                "de " + nomeAmigo + ".");
        System.out.println("Desta forma, para que " + nomePersonagemPrincipal + " cumpra seu objetivo, o estatuto de "
        + nomeAmigo + " também deve estar acima de 2000.");
        limparTela();
        System.out.println("********************************************************");
        System.out.println("Tudo pronto! Agora é hora de tomar decisões, divididas em quatro períodos de cada dia, [manhã," +
                " almoço, tarde e noite], ao longo de 100 dias.");
        System.out.println("********************************************************");
        System.out.println();
        exibirDetalhesPersonagemPrincipal();
        System.out.println();
        System.out.println();
        System.out.println("********************************************************");
        System.out.println("Boa sorte! " + nomePersonagemPrincipal + " conta com você para realizar seu objetivo.");
        System.out.println("********************************************************");
        limparTela();
    }

    /**
     * Método com ciclo que representa os dias que o personagem tem para cumprir o objetivo
     */
    public void jogo() {
        // Cada ciclo representa um dia
        for (int i = 1; i <= 100 ; i++) {
            System.out.println("**************");
            System.out.println("Dia " + i);
            System.out.println("**************");

            // Array com os quatro períodos do dia
            String[] periodosDoDia = {"manhã", "almoço", "tarde", "noite"};

            int periodoIndex = 0;

            while (periodoIndex < periodosDoDia.length) {
                limparTela();
                String periodo = periodosDoDia[periodoIndex];

                if (periodo.equals("manhã")) {
                    System.out.println("Período: " + periodo);
                    System.out.println("***************");
                    System.out.println("Bom dia!");
                    System.out.println("O que " + nomePersonagemPrincipal + " fará primeiro hoje?");
                    System.out.println("*****************************");
                    System.out.println("[1] Praticar " + instrumentoEscolhido);
                    System.out.println("[2] Comprar um vinil de jazz");
                    System.out.println("[3] Ter aula");
                    System.out.println("[4] Tomar um pequeno-almoço saudável");
                    System.out.println("[5] Comer uma junkie food");
                    System.out.println("[6] Encontrar " + nomeAmigo);
                    System.out.println("[7] Andar de bicicleta");
                    System.out.println("[8] Voltar a dormir");
                    System.out.println("[9] Tomar uma xícara de café");
                    System.out.println("*****************************");
                    System.out.print("Responda aqui: ");
                    int escolhaComportamentoManha = scanner.nextInt();
                    scanner.nextLine();
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
                            break;
                        case 9:
                            saudeComportamentos.tomarCafe();
                    }
                }

                if (periodo.equals("almoço")) {
                    System.out.println("Período: " + periodo);
                    System.out.println("***************");
                    System.out.println("Chegou a hora do almoço!");
                    System.out.println("O que " + nomePersonagemPrincipal + " fará agora?");
                    System.out.println("*****************************");
                    System.out.println("[1] Almoçar uma comida saudável sozinha");
                    System.out.println("[2] Comprar um vinil de jazz");
                    System.out.println("[3] Ter aula");
                    System.out.println("[4] Dormir um pouco");
                    System.out.println("[5] Comer uma junkie food");
                    System.out.println("[6] Almoçar com " + nomeAmigo);
                    System.out.println("[7] Andar de bicicleta");
                    System.out.println("[8] Trabalhar");
                    System.out.println("[9] Praticar");
                    System.out.println("*****************************");
                    System.out.print("Responda aqui: ");
                    int escolhaComportamentoManha = scanner.nextInt();
                    scanner.nextLine();
                    switch (escolhaComportamentoManha) {
                        case 1:
                            saudeComportamentos.comerComidaSaudavel();
                            break;
                        case 2:
                            habilidadeComportamentos.comprarVinilDeJazz();
                            break;
                        case 3:
                            habilidadeComportamentos.terAula();
                            break;
                        case 4:
                            saudeComportamentos.dormir();
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
                            dinheiroComportamentos.trabalhar();
                            break;
                        case 9:
                            habilidadeComportamentos.praticar();
                    }
                }

                if (periodo.equals("tarde")) {
                    System.out.println("Período: " + periodo);
                    System.out.println("***************");
                    System.out.println("Hora de decidir como será a tarde de " + nomePersonagemPrincipal);
                    System.out.println("*****************************");
                    //Colocar métodos da tarde
                    System.out.println("[1] Fazer terapia");
                    System.out.println("[2] Dormir a sesta");
                    System.out.println("[3] Tomar xícara de café");
                    System.out.println("[4] Trabalhar");
                    System.out.println("[5] Comer uma junkie food");
                    System.out.println("[6] Sair com " + nomeAmigo);
                    System.out.println("[7] Andar de bicicleta");
                    System.out.println("[8] Comprar um vinho");
                    System.out.println("[9] Praticar " + instrumentoEscolhido);
                    System.out.println("[10] Praticar em excesso");
                    System.out.println("[11] Comprar um vinil de Jazz");
                    System.out.println("[12] Ter aula com " + nomeProfessor);
                    System.out.println("*****************************");
                    System.out.print("Responda aqui: ");
                    int escolhaComportamentoManha = scanner.nextInt();
                    scanner.nextLine();
                    switch (escolhaComportamentoManha) {
                        case 1:
                            saudeComportamentos.fazerTerapia();
                            break;
                        case 2:
                            saudeComportamentos.dormir();
                            break;
                        case 3:
                            saudeComportamentos.tomarCafe();
                            break;
                        case 4:
                            dinheiroComportamentos.trabalhar();
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
                            humorComportamentos.comprarVinho();
                            break;
                        case 9:
                            habilidadeComportamentos.praticar();
                            break;
                        case 10:
                            humorComportamentos.encontrarPesssoaFavorita();
                            break;
                        case 11:
                            habilidadeComportamentos.comprarVinilDeJazz();
                            break;
                        case 12:
                            habilidadeComportamentos.terAula();
                    }
                }

                if (periodo.equals("noite")) {
                    System.out.println("Período: " + periodo);
                    System.out.println("***************");
                    System.out.println("Já é noite!");
                    System.out.println("O que " + nomePersonagemPrincipal + " fará antes de terminar o dia?");
                    System.out.println("*****************************");
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
                    System.out.println("[11] Comprar um vinho");
                    System.out.println("[12] Praticar " + instrumentoEscolhido);
                    System.out.println("[13] Praticar em excesso");
                    System.out.println("[14] Comprar um vinil de Jazz");
                    System.out.println("[15] Ter aula com " + nomeProfessor);
                    System.out.println("[16] Assistir a um concerto de jazz");
                    System.out.println("*****************************");
                    System.out.print("Responda aqui: ");
                    int escolhaComportamentoManha = scanner.nextInt();
                    scanner.nextLine();
                    switch (escolhaComportamentoManha) {
                        case 1:
                            saudeComportamentos.fazerTerapia();
                            break;
                        case 2:
                            saudeComportamentos.dormir();
                            break;
                        case 3:
                            saudeComportamentos.tomarCafe();
                            break;
                        case 4:
                            dinheiroComportamentos.trabalhar();
                            break;
                        case 5:
                            dinheiroComportamentos.fazerHoraExtra();
                            break;
                        case 6:
                            dinheiroComportamentos.tocarEmBar();
                            break;
                        case 7:
                            humorComportamentos.comerJunkieFood();
                            break;
                        case 8:
                            saudeComportamentos.comerComidaSaudavel();
                            break;
                        case 9:
                            humorComportamentos.encontrarPesssoaFavorita();
                            break;
                        case 10:
                            saudeComportamentos.andarDeBike();
                            break;
                        case 11:
                            humorComportamentos.comprarVinho();
                            break;
                        case 12:
                            habilidadeComportamentos.praticar();
                            break;
                        case 13:
                            habilidadeComportamentos.praticarEmExcesso();
                            break;
                        case 14:
                            habilidadeComportamentos.comprarVinilDeJazz();
                            break;
                        case 15:
                            habilidadeComportamentos.terAula();
                            break;
                        case 16:
                        humorComportamentos.assistirConcerto();
                    }
                }

                // Eventos ao longo da história
                if (i == 2 && periodo.equals("tarde")) {
                    limparTela();
                    eventos.resfriado();
                }

                if (i == 5 && periodo.equals("noite")) {
                    limparTela();
                    eventos.quedaBicicleta();
                }

                if (i == 8 && periodo.equals("almoço")) {
                    limparTela();
                    eventos.bloqueioCriativo();
                }

                if (i == 15 && periodo.equals("noite")) {
                    limparTela();
                    eventos.insonia();
                }

                if (i == 22 && periodo.equals("manhã")) {
                    limparTela();
                    eventos.tocarEmCasamento();
                }

                if (i == 29 && periodo.equals("noite")) {
                    limparTela();
                    eventos.instrumentoAvariado();
                }

                if (i == 36 && periodo.equals("tarde")) {
                    limparTela();
                    eventos.discussaoComProfessor();
                }

                if (i == 45 && periodo.equals("tarde")) {
                    limparTela();
                    eventos.visitaDaMae();
                }

                if (i == 45 && periodo.equals("manhã")) {
                    limparTela();
                    eventos.discussaoComAmigo();
                }

                if (i == 51 && periodo.equals("noite")) {
                    limparTela();
                    eventos.discussaoComAmigo();
                }

                if (i == 56 && periodo.equals("tarde")) {
                    limparTela();
                    eventos.diaDeSorte();
                }

                if (i == 63 && periodo.equals("manhã")) {
                    limparTela();
                    eventos.insonia();
                }

                if (i == 69 && periodo.equals("noite")) {
                    limparTela();
                    eventos.visitaDaMae();
                }

                if (i == 72 && periodo.equals("manhã")) {
                    limparTela();
                    eventos.quedaBicicleta();
                }

                if (i == 78 && periodo.equals("tarde")) {
                    limparTela();
                    eventos.bloqueioCriativo();
                }

                if (i == 85 && periodo.equals("noite")) {
                    limparTela();
                    eventos.tocarEmCasamento();
                }

                if (i == 91 && periodo.equals("manhã")) {
                    limparTela();
                    eventos.resfriado();
                }

                if (i == 94 && periodo.equals("manhã")) {
                    limparTela();
                    eventos.prendadoAmigo();
                }

                if (i == 99 && periodo.equals("tarde")) {
                    limparTela();
                    eventos.tocarEmCasamento();
                }
                periodoIndex++;
            }
        }
    }

    /**
     * Método que exibe se o utilizador cumpriu o objetivo, consoante aos valores dos estatutos dos personagens e pergunta
     * se ele deseja jogar novamente ou sair
     */
    public void fimJogo() {
        // Condições para cumprir objetivo
        if (jogador.getEstatuto() >= 5500 && nomeProfessor.getEstatuto() >= 2000
                && nomeAmigo.getEstatuto() >= 2000 && jogador.getHabilidade() > 0 && jogador.getDinheiro() > 0 &&
        jogador.getHumor() > 0 && jogador.getSaude() > 0) {
            System.out.println();
            System.out.println("********************");
            System.out.println("*** PARABÉNS!!! ****");
            System.out.println("********************");
            System.out.println();
            limparTela();
            System.out.println("Graças a você " + nomePersonagemPrincipal + " tocará na Casa da Música!!!");
            System.out.println("Com certeza daqui em diante a carreira musical dela irá decolar.");
            limparTela();
        } else {
            System.out.println();
            System.out.println("*****************************************************************************" +
                    "*************************************************");
            System.out.println("Infelizmente você não atingiu o objetivo de " + nomePersonagemPrincipal + ".");
            System.out.println("*****************************************************************************" +
                    "*************************************************");
            System.out.println();

            // Pergunta se o jogador quer continuar
            System.out.println("O que deseja fazer agora?");
            System.out.println("[1] Jogar novamente");
            System.out.println("[2] Sair");
            System.out.print("Responda aqui: ");
            int resposta = scanner.nextInt();
            if (resposta == 1) {
                introJogo();
                jogo();
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("*****************************");
        System.out.println("Obrigado por jogar Whiplash.");
        System.out.println("*****************************");
        System.out.println();
        System.out.println();
        System.out.println("Jazz is the most beautiful music in the world, because it's freedom.");
        System.out.println("                                                      Duke Ellington");
    }

}

