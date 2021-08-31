package one.digital.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/*
Quando utilizar:
Quando é necessário manter a ordem de
inserção dos elementos

Ordenação:
Mantem a ordem de inserção dos elementos

Performance:
É a implementação mais lenta pois é necessária manter
a ordem
*/

public class ConjuntoLinkedHashSet {
    public static void main(String[] args) {

        LinkedHashSet<Integer> sequencia =  new LinkedHashSet<>();

        sequencia.add(8);
        sequencia.add(5);
        sequencia.add(3);
        sequencia.add(6);
        sequencia.add(6);
        sequencia.add(9);

        // Garante a ordem de inserção
        System.out.println(sequencia);

        sequencia.remove(6);
        sequencia.remove(0);
        System.out.println(sequencia);

        var tamanho = sequencia.size();
        System.out.println("tamanho: " + tamanho + " de " + sequencia);

        System.out.println("Tem na LinkedHashSet? " + sequencia.contains(9.5));
        System.out.println("A LinkedHashSet está vazia? " + sequencia.isEmpty());

        for(Integer nomeitem: sequencia)
        {
            System.out.println("For..." + nomeitem);
        }

        Iterator<Integer> iterator = sequencia.iterator();

        while(iterator.hasNext())
        {
            System.out.println("Itera..." + iterator.next());
        }

        sequencia.clear();

        System.out.println("E agora? " + sequencia.isEmpty());
    }
}
