package Shopping;

public enum Vinil {

    JOHN_COLTRANE ("John Coltrane"),
    MILES_DAVIS ("Miles Davis"),
    CHARLIE_PARKER ("Charlie Parker"),
    BILLIE_HOLIDAY ("Billie Holiday");

    private String nome;

    Vinil(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
