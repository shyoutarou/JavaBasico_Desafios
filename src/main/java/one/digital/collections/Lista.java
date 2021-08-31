package one.digital.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

public class Lista {
    public static void main(String[] args) {
        int[] arrayinteiros = new int[7];
        int[] numeros = {1,2,3,4,5,6,7};
        numeros[0] = 1200;
        System.out.println(numeros.length);

        IntStream.range(0,3).forEach(n->{
            System.out.println("Valor array..." + numeros[n] );
        });

        int[][] arrayMulti = {{1,2,3,4,5,6,7}, {23,24,25}};

        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes);

        Collections.sort(nomes);
        System.out.println(nomes);
        nomes.set(0,"Larissa");
        nomes.set(5,"Luísa");

        System.out.println(nomes);

        nomes.remove("Luísa");
        nomes.remove(0);
        var tamanho = nomes.size();
        System.out.println("tamanho: " + tamanho + " de " + nomes);

        var pessoa = nomes.get(2);

        System.out.println("Tem " + pessoa + " na lista? " + nomes.contains("Juliana"));
        System.out.println("Por indexof " + nomes.indexOf("Maria") + nomes.indexOf("Juliana") + nomes.indexOf("Ruy"));
        System.out.println("A lista está vazia? " + nomes.isEmpty());

        for(String nomeitem: nomes)
        {
            System.out.println("For..." + nomeitem);
        }

        Iterator<String> iterator = nomes.iterator();

        while(iterator.hasNext())
        {
            System.out.println("Itera..." + iterator.next());
        }

        nomes.clear();

        System.out.println("E agora? " + nomes.isEmpty());
    }
}
