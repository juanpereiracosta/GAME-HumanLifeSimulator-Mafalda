package Shopping;

public enum Vinho {

    VINHO_BRANCO("Vinho branco"),
    VINHO_TINTO("Vinho tinto"),
    VINHO_VERDE(""),
    VINHO_ROSE("Vinho rosé");

    private String nome;

    Vinho(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
