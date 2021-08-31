package one.digital.collections;

import java.util.*;
import java.util.stream.IntStream;

public class Fila {
    public static void main(String[] args) {

        Queue<String> filabanco = new LinkedList<>();

        filabanco.add("Carlos");
        filabanco.add("Pedro");
        filabanco.add("Juliana");
        filabanco.add("Anderson");
        filabanco.add("Maria");
        filabanco.add("João");

        var cliente = filabanco.peek();
        System.out.println(cliente);

        //Igual a peek mas dá exceção se a fila estiver vazia
        cliente = filabanco.element();
        System.out.println(cliente);

        //Recupera e remove da fila
        cliente = filabanco.poll();
        System.out.println(cliente);
        System.out.println(filabanco);

        filabanco.remove("João");
        filabanco.remove(0);
        var tamanho = filabanco.size();
        System.out.println("tamanho: " + tamanho + " de " + filabanco);

        var pessoa = filabanco.element();

        System.out.println("Tem " + pessoa + " na fila? " + filabanco.contains(pessoa));
        System.out.println("A fila está vazia? " + filabanco.isEmpty());

        for(String nomeitem: filabanco)
        {
            System.out.println("For..." + nomeitem);
        }

        Iterator<String> iterator = filabanco.iterator();

        while(iterator.hasNext())
        {
            System.out.println("Itera..." + iterator.next());
        }

        filabanco.clear();

        System.out.println("E agora? " + filabanco.isEmpty());
    }
}
