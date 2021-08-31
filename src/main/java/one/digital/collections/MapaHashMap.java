package one.digital.collections;

import java.util.*;

public class MapaHashMap {
    public static void main(String[] args) {

        Map<String, Integer> campeoesFIFA =  new HashMap<>();

        campeoesFIFA.put("Brasil", 5);
        campeoesFIFA.put("Alemanha", 4);
        campeoesFIFA.put("Itália", 4);
        campeoesFIFA.put("Uruguai", 2);
        campeoesFIFA.put("Argentina", 2);
        campeoesFIFA.put("França", 2);
        campeoesFIFA.put("Inglaterra", 2);
        campeoesFIFA.put("Espanha", 2);

        System.out.println(campeoesFIFA);

        campeoesFIFA.put("Brasil", 7);
        System.out.println(campeoesFIFA);

        System.out.println(campeoesFIFA.get("Alemanha"));
        System.out.println(campeoesFIFA.containsKey("França"));
        campeoesFIFA.remove("França");

        var tamanho = campeoesFIFA.size();
        System.out.println("tamanho: " + tamanho + " de " + campeoesFIFA);

        System.out.println("Tem 7 vezes campeão? " + campeoesFIFA.containsValue(7));
        System.out.println("O Map está vazio? " + campeoesFIFA.isEmpty());

        for(Map.Entry<String, Integer>  item: campeoesFIFA.entrySet())
        {
            System.out.println("For..." + item.getKey() + "-" + item.getValue());
        }

        for(String key: campeoesFIFA.keySet())
        {
            System.out.println("Forkey..."  + key + "-" + campeoesFIFA.get(key));
        }

        Iterator<String> iterator = campeoesFIFA.keySet().iterator();

        while(iterator.hasNext())
        {
            var key = iterator.next();
            System.out.println("Itera..." + key + "-" + campeoesFIFA.get(key));
        }

        campeoesFIFA.clear();

        System.out.println("E agora? " + campeoesFIFA.isEmpty());
    }
}
