package Main;

import Objetivo.Objetivo;
import Pessoa.Mafalda;
import Profissao.Profissao;
import Sims.*;

public class Main {

    public static void main(String[] args) {

        // Objetos
        Profissao profissao = new Profissao("Garçonete", 10.00, false);
        Mafalda mafalda = new Mafalda("Mafalda", profissao, Objetivo.COMPRAR_SAXOFONE);

        // O parâmetro "mafalda" é utilizado para inicializar o atributo mafalda dentro da classe SaudeManager
        // Já que no construtor, o parâmetro foi definido para ter um objeto do tipo Mafalda
        SaudeComportamentos saudeComportamentos = new SaudeComportamentos(mafalda);
        HumorComportamentos humorComportamentos = new HumorComportamentos(mafalda);
        HabilidadeComportamentos habilidadeComportamentos = new HabilidadeComportamentos(mafalda);
        DinheiroComportamentos dinheiroComportamentos = new DinheiroComportamentos(mafalda);

        /*mafalda.exibirDetalhes();
        saudeComportamentos.andarDeBike();
        mafalda.exibirDetalhes();
        humorComportamentos.beberTacaDeVinho();
        mafalda.exibirDetalhes();
        dinheiroComportamentos.discotecar();
        mafalda.exibirDetalhes();
        habilidadeComportamentos.praticar();
        mafalda.exibirDetalhes();*/

        Sims sims = new Sims();

        sims.jogo();

    }
}
