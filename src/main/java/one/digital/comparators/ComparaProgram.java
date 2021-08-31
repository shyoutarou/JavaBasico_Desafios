package one.digital.comparators;

import java.util.*;

public class ComparaProgram {
    public static void main(String[] args) {

        List<ClasseComparable> estudantes = new ArrayList<ClasseComparable>();

        estudantes.add(new ClasseComparable( "Carlos", 12));
        estudantes.add(new ClasseComparable( "Pedro", 72));
        estudantes.add(new ClasseComparable( "Juliana", 32));
        estudantes.add(new ClasseComparable( "Anderson", 27));
        estudantes.add(new ClasseComparable( "Maria", 22));
        estudantes.add(new ClasseComparable( "João", 92));

        System.out.println("Ordem de inserção");
        System.out.println(estudantes);

        System.out.println("Ordem de natural dos números");
        estudantes.sort((first,second)-> first.getidade() - second.getidade());
        estudantes.sort(Comparator.comparingInt( ClasseComparable::getidade));
        System.out.println(estudantes);

        System.out.println("Ordem de inversa dos números");
        estudantes.sort((first,second)-> second.getidade() - first.getidade());
        estudantes.sort(Comparator.comparingInt( ClasseComparable::getidade).reversed());
        System.out.println(estudantes);

        System.out.println("Ordem de natural dos números, inteface Comparable");
        Collections.sort(estudantes);
        System.out.println(estudantes);

        System.out.println("Ordem de inversa dos números, inteface Comparator");
        Collections.sort(estudantes, new ClasseComparatorReversa());
        System.out.println(estudantes);
    }
}
