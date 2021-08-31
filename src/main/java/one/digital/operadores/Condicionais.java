package one.digital.operadores;

public class Condicionais {

    public static void main(String[] args) {

        final var condicao = false;

        if (condicao) {
            System.out.println("A condição é verdadeira");
        } else {
            System.out.println("A condição é falsa");
        }

        if (condicao)
            System.out.println("Uma única linha...");

        final var ternario = condicao ? "é verdadeira" : "é falsa";

        System.out.println(ternario);


        final var numero = 11;

        if (numero == 10) {
            System.out.println("O número é 10");
        } else {
            System.out.println("O número  não é 10");
        }

        if (numero != 10) {
            System.out.println("O número não é 10");
        } else {
            System.out.println("O número é 10");
        }

        final var letra = "B";

        if ("A".equals(letra)) {
            System.out.println("É a letra A");
        }

        if (!letra.equals("A")) {
            System.out.println("Não é a letra A");
        }
    }
}
