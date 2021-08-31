package one.digital.enums;

public enum Status {
    OPEN(13,"Aberto"),
    CLOSE(13,"Fechado"),
    VACATION(44,"Off"),
    LUNCHTIME(12, "Hmmmm");

    private int cod;
    private String texto;

    Status(final int cod, final String texto)
    {
        this.cod = cod;
        this.texto = texto;
    }

    public int getCod(){return this.cod; };
    public String getTexto(){return this.texto; };
}
