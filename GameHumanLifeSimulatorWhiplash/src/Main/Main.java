package Main;

import Pessoa.Jogador;
import Profissao.Profissao;
import Sims.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Jogador jogador = new Jogador("jogador");
        Sims sims = new Sims(jogador);
        sims.introJogo();
        sims.jogo();
        sims.fimJogo();
    }
}

