package Main;

import Pessoa.Jogador;
import Profissao.Profissao;
import Sims.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Profissao profissao = new Profissao("profissao", 10.00, true);
        Jogador jogador = new Jogador("jogador");
        Sims sims = new Sims(jogador);
        HabilidadeComportamentos habilidadeComportamentos = new HabilidadeComportamentos(jogador, sims);
        sims.introJogo();
        sims.jogo();
        habilidadeComportamentos.comprarVinilDeJazz();
    }
}
