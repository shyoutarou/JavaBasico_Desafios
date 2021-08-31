package one.digital.collections;

import java.util.*;

/*
Quando utilizar:
Quando não é necessário manter uma ordenação

Ordenação:
Não é ordenado, e não permite valores repetidos

Performance:
Como não tem repetição de elementos e
não tem ordenação é a implementação mais performática

*/

public class ConjuntoHashSet {
    public static void main(String[] args) {

        Set<Double> notasAlunos =  new HashSet<>();

        notasAlunos.add(8.2);
        notasAlunos.add(5.5);
        notasAlunos.add(3.9);
        notasAlunos.add(6.8);
        notasAlunos.add(6.5);
        notasAlunos.add(9.5);

        // Não garante a ordem de inserção
        System.out.println(notasAlunos);

        notasAlunos.remove(6.5);
        notasAlunos.remove(0);
        System.out.println(notasAlunos);

        var tamanho = notasAlunos.size();
        System.out.println("tamanho: " + tamanho + " de " + notasAlunos);

        System.out.println("Tem na HashSet? " + notasAlunos.contains(9.5));
        System.out.println("A HashSet está vazia? " + notasAlunos.isEmpty());

        for(Double nomeitem: notasAlunos)
        {
            System.out.println("For..." + nomeitem);
        }

        Iterator<Double> iterator = notasAlunos.iterator();

        while(iterator.hasNext())
        {
            System.out.println("Itera..." + iterator.next());
        }

        notasAlunos.clear();

        System.out.println("E agora? " + notasAlunos.isEmpty());
    }
}
