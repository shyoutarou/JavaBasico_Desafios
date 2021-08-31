package one.digital.arrays;

import java.util.stream.IntStream;

public class Arrays {
    public static void main(String[] args) {
        int[] arrayinteiros = new int[7];
        int[] numeros = {1,2,3,4,5,6,7};
        numeros[0] = 1200;
        System.out.println(numeros.length);

        IntStream.range(0,3).forEach(n->{
            System.out.println("Valor array..." + numeros[n] );
        });

        int[][] arrayMulti = {{1,2,3,4,5,6,7}, {23,24,25}};
    }
}
