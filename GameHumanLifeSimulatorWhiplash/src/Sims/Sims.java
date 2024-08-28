package Sims;

import Objetivo.Objetivo;
import Pessoa.Mafalda;
import Profissao.Profissao;
import java.util.ArrayList;
import java.util.Scanner;

public class Sims {

    Scanner scanner = new Scanner(System.in);

    private Mafalda mafalda;
    private Eventos eventos;

    /**
     * Método construtor de <b>Sims</b>
     * @param mafalda
     */
    public Sims(Mafalda mafalda) {
        this.mafalda = mafalda;

        // A instância de Eventos deve operar sobre a instância específica de Mafalda que foi passada como parãmetro
        this.eventos = new Eventos(mafalda);
    }

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

