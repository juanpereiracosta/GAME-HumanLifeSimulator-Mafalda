package Main;

import Objetivo.Objetivo;
import Pessoa.Jogador;
import Profissao.Profissao;
import Sims.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*
       // Objetos
        Profissao profissao = new Profissao("Garçonete", 10.00, false);
        Mafalda mafalda = new Mafalda("Mafalda", profissao, Objetivo.COMPRAR_SAXOFONE);

        // O parâmetro "mafalda" é utilizado para inicializar o atributo mafalda dentro de cada classe
        // No construtor, o parâmetro foi definido para ser um objeto do tipo Mafalda
        SaudeComportamentos saudeComportamentos = new SaudeComportamentos(mafalda);
        HumorComportamentos humorComportamentos = new HumorComportamentos(mafalda);
        HabilidadeComportamentos habilidadeComportamentos = new HabilidadeComportamentos(mafalda);
        DinheiroComportamentos dinheiroComportamentos = new DinheiroComportamentos(mafalda);*/
        Profissao profissao = new Profissao("Garçonete", 10.00, false);

        Jogador mafalda = new Jogador("Mafalda", profissao, Objetivo.COMPRAR_SAXOFONE);
        Sims sims = new Sims(mafalda);

        sims.introJogo();




    }
}
