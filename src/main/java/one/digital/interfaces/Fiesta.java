package one.digital.interfaces;

public class Fiesta implements Veiculo, Carro{
    @Override
    public String marca() {
        return "Ford";
    }

    @Override
    public String registro() {
        return "DSDSAUDHSIDHI";
    }

    @Override
    public void ligar() {
        Carro.super.ligar();
        Veiculo.super.ligar();
    }
}
