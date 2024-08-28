package Sims;

import Pessoa.Mafalda;

public class Eventos {

    private Mafalda mafalda;

    public Eventos(Mafalda mafalda) {
        this.mafalda = mafalda;
    }

    public void resfriado() {
        System.out.println("A apresentação de ontem foi até tarde e estava muito frio.");
        System.out.println("Por conta disso, Mafalda acabou ficando resfriada.");
        System.out.println("Infelizmente, sua saúde foi afetada!");
        mafalda.setSaude(mafalda.getSaude() - 70);
        mafalda.calcularEstatuto();
    }

    public void quedaBicicleta() {
        System.out.println("Ao andar de bicicleta, Mafalda teve um pequeno acidente.");
        System.out.println("Ela está bem!");
        System.out.println("Porém, houve uma pequena torção no pulso que afetará sua saúde e sua habilidade.");
        mafalda.setSaude(mafalda.getSaude() - 30);
        mafalda.setHabilidade(mafalda.getHabilidade() - 40);
        mafalda.calcularEstatuto();
    }

    public void insonia() {
        System.out.println("Infelizmente, todos nós estamos sujeitos a uma noite de sono ruim.");
        System.out.println("E essa não foi uma boa noite de sono para Mafalda!");
        System.out.println("Sua saúde foi um pouco prejudicada.");
        mafalda.setSaude(mafalda.getSaude() - 40);
    }

    public void bloqueioCriativo() {
        System.out.println("Mafalda não está muito inspirada hoje.");
        System.out.println("Talvez domir um pouco ou andar de bicicleta possa ajudar.");
        System.out.println("Nesse momento, sua habilidade diminuiu um pouco.");
    }


}
