package Main;

import Objetivo.Objetivo;
import Pessoa.Mafalda;
import Profissao.Profissao;
import Sims.SaudeComportamentos;

public class Main {

    public static void main(String[] args) {

        // Objetos
        Profissao profissao = new Profissao("Garçonete", 10.00, false);
        Mafalda mafalda = new Mafalda("Mafalda", profissao, Objetivo.COMPRAR_SAXOFONE);
        SaudeComportamentos saudeComportamentos = new SaudeComportamentos(mafalda);

        mafalda.exibirDetalhes();
        saudeComportamentos.andarDeBike();
        mafalda.exibirDetalhes();
    }
}
