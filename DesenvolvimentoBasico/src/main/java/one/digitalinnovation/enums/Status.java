package one.digitalinnovation.enums;

public enum Status {
    OPEN(13, "Aberto"),
    CLOSE(2, "Fechado");

    private final int cod;
    private final String texto;

    Status(int cod, String texto) {
        this.cod = cod;
        this.texto = texto;
    }

    public int getCod() {
        return cod;
    }

    public String getTexto() {
        return texto;
    }
}
