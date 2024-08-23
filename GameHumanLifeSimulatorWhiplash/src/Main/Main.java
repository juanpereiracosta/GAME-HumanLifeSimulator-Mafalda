package Main;

import Objetivo.Objetivo;
import Pessoa.Mafalda;
import Profissao.Profissao;

public class Main {

    public static void main(String[] args) {

        Profissao profissao = new Profissao("Garçonete", 10, false);
        Mafalda mafalda = new Mafalda("Mafalda", profissao, Objetivo.COMPRAR_SAXOFONE);
        mafalda.exibirDetalhes();
    }
}
