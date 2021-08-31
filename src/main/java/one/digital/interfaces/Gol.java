package one.digital.interfaces;

public class Gol implements Carro{

    private static int lugares = 0;
    private static String _marca = "";
    private static String _modelo = "";
    private static int _ano = 0;
    private static String _variante = "";

    public void Carro() {}

    public void Carro(String marca, String modelo, int ano, String variante) {
        this._marca = marca;
        this._modelo = modelo;
        this._ano = ano;
        this._variante = variante;
    }

    @Override
    public String marca() {
        return "Volkswagen";
    }

    public void entrar() {
        lugares++;
    }
    public void sair() {
        lugares--;
    }
    public String lotacao() {
        return lugares + " lugares ocupados";
    }
}
