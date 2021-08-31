package one.digital.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
Quando utilizar:
Quando é necessário alterar a ordem através
do uso de comparators

Ordenação:
Mantem a ordem e pode ser reordenado

Performance:
É performático para leitura. Para modificação tem a
necessidade de reordenar, sendo mais lento do que a
LinkedHashSet

*/

public class ConjuntoTreeSet {
    public static void main(String[] args) {

        TreeSet<String> capitais =  new TreeSet<>();

        capitais.add("Porto Alegre");
        capitais.add("Florianópolis");
        capitais.add("Curitiba");
        capitais.add("São Paulo");
        capitais.add("Rio de Janeiro");
        capitais.add("Belo Horizonte");

        System.out.println(capitais);
        System.out.println("First: " + capitais.first());
        System.out.println("Last: " + capitais.last());
        System.out.println("Lower: " + capitais.lower("Florianópolis"));
        System.out.println("Higher: " + capitais.higher("Florianópolis"));

        System.out.println("PollFirst: " + capitais.pollFirst());
        System.out.println("PollLast: " + capitais.pollLast());
        System.out.println(capitais);

        capitais.remove("Rio de Janeiro");
        System.out.println(capitais);

        var capital = capitais.first();

        var tamanho = capitais.size();
        System.out.println("tamanho: " + tamanho + " de " + capitais);

        System.out.println("Tem " + capital + " na TreeSet? " + capitais.contains(capital));
        System.out.println("A TreeSet está vazia? " + capitais.isEmpty());

        for(String nomeitem: capitais)
        {
            System.out.println("For..." + nomeitem);
        }

        Iterator<String> iterator = capitais.iterator();

        while(iterator.hasNext())
        {
            System.out.println("Itera..." + iterator.next());
        }

        capitais.clear();

        System.out.println("E agora? " + capitais.isEmpty());
    }
}
