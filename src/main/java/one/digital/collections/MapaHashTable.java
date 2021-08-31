package one.digital.collections;

import java.util.*;

public class MapaHashTable {
    public static void main(String[] args) {

        Hashtable<String, Integer> estudantes = new Hashtable<>();

        estudantes.put("Carlos", 12);
        estudantes.put("Pedro", 72);
        estudantes.put("Juliana", 32);
        estudantes.put("Anderson", 27);
        estudantes.put("Maria", 22);
        estudantes.put("João", 92);

        System.out.println(estudantes);

        estudantes.put("João", 22);
        System.out.println(estudantes);
        estudantes.remove("João");
        var tamanho = estudantes.size();
        System.out.println("tamanho: " + tamanho + " de " + estudantes);

        var idade = estudantes.get("Juliana");

        System.out.println("Tem idade " + idade + "? " + estudantes.contains(idade));
        System.out.println("A Hashtable está vazia? " + estudantes.isEmpty());

        for(Map.Entry<String, Integer>  item: estudantes.entrySet())
        {
            System.out.println("For..." + item.getKey() + "-" + item.getValue());
        }

        for(String key: estudantes.keySet())
        {
            System.out.println("Forkey..."  + key + "-" + estudantes.get(key));
        }

        Iterator<String> iterator = estudantes.keySet().iterator();

        while(iterator.hasNext())
        {
            var key = iterator.next();
            System.out.println("Itera..." + key + "-" + estudantes.get(key));
        }

        estudantes.clear();

        System.out.println("E agora? " + estudantes.isEmpty());
    }
}
