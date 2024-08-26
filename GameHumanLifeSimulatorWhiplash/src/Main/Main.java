package Main;

import Objetivo.Objetivo;
import Pessoa.Mafalda;
import Profissao.Profissao;
import Sims.DinheiroComportamentos;
import Sims.HabilidadeComportamentos;
import Sims.HumorComportamentos;
import Sims.SaudeComportamentos;

public class Main {

    public static void main(String[] args) {

        // Objetos
        Profissao profissao = new Profissao("Garçonete", 10.00, false);
        Mafalda mafalda = new Mafalda("Mafalda", profissao, Objetivo.COMPRAR_SAXOFONE);
        SaudeComportamentos saudeComportamentos = new SaudeComportamentos(mafalda);
        HumorComportamentos humorComportamentos = new HumorComportamentos(mafalda);
        HabilidadeComportamentos habilidadeComportamentos = new HabilidadeComportamentos(mafalda);
        DinheiroComportamentos dinheiroComportamentos = new DinheiroComportamentos(mafalda);

        mafalda.exibirDetalhes();
        saudeComportamentos.andarDeBike();
        mafalda.exibirDetalhes();
    }
}
