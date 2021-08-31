package one.digital.interfaces;

public class ProgramaInterfaces {
    public static void main(String[] args) {
        final Gol gol = new Gol();
        System.out.println("Marca do carro: " + gol.marca());
        gol.ligar();
        gol.entrar();
        gol.entrar();
        System.out.println(gol.lotacao());
        gol.sair();
        System.out.println(gol.lotacao());

        final Veiculo trator = new Trator();
        System.out.println("Registro do veiculo: " + trator.registro());
        trator.ligar();

        final Fiesta fiesta = new Fiesta();
        System.out.println("Marca do fiesta: " + fiesta.marca());
        System.out.println("Registro do fiesta: " + fiesta.registro());
        fiesta.ligar();
    }
}
