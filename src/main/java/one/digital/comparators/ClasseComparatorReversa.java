package one.digital.comparators;

import java.util.Comparator;

public class ClasseComparatorReversa implements Comparator<ClasseComparable> {
    @Override
    public int compare(ClasseComparable o1, ClasseComparable o2) {
        return o2.getidade() - o1.getidade();
    }
}
