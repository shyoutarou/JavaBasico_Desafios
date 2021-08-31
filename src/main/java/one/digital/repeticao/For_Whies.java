package one.digital.repeticao;

import java.util.stream.IntStream;

public class For_Whies {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i = i + 1) {
            System.out.println("I=" + i);
        }

        for (int x = 0; x <= 5; x++)
            System.out.println("X=" + x);


        var x = 0;

        //Testa a condição antes
        while (x < 1) {
            System.out.println("Dentro do while...");
            x++;
        }

        var y = 0;

        //Testa a condição depois
        do {
            System.out.println("Dentro do do/while...");
        } while (y++ < 1);

        IntStream.of(1,2,3,4,5).forEach(n->{
            System.out.println("Valor..." + n);
        });

        IntStream.range(0,3).forEach(n->{
            System.out.println("Valor range..." + n);
        });
    }
}
