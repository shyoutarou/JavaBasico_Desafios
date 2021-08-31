package one.digital.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapaTreeMap {
    public static void main(String[] args) {

        TreeMap<String, String> capitais =  new TreeMap<>();

        capitais.put("RS", "Porto Alegre");
        capitais.put("SC", "Florianópolis");
        capitais.put("PR", "Curitiba");
        capitais.put("SP", "São Paulo");
        capitais.put("RJ", "Rio de Janeiro");
        capitais.put("MG", "Belo Horizonte");

        System.out.println(capitais);

        System.out.println("First: " + capitais.firstKey());
        System.out.println("Last: " + capitais.lastKey());
        System.out.println("Lower: " + capitais.lowerKey("SC"));
        System.out.println("Higher: " + capitais.higherKey("SC"));

        System.out.println("PollFirst: " + capitais.pollFirstEntry());
        System.out.println("PollLast: " + capitais.pollLastEntry());
        capitais.put("RR", "Rio de Janeiro");
        System.out.println(capitais);

        System.out.println(capitais.get("RJ"));
        System.out.println(capitais.containsKey("RR"));
        capitais.remove("RR");

        var tamanho = capitais.size();
        System.out.println("tamanho: " + tamanho + " de " + capitais);

        var capital = capitais.get("PR");

        System.out.println("Tem " + capital + "? " + capitais.containsValue(capital));
        System.out.println("A TreeMap está vazia? " + capitais.isEmpty());

        for(Map.Entry<String, String>  item: capitais.entrySet())
        {
            System.out.println("For..." + item.getKey() + "-" + item.getValue());
        }

        for(String key: capitais.keySet())
        {
            System.out.println("Forkey..."  + key + "-" + capitais.get(key));
        }

        Iterator<String> iterator = capitais.keySet().iterator();

        while(iterator.hasNext())
        {
            var key = iterator.next();
            System.out.println("Itera..." + key + "-" + capitais.get(key));
        }

        capitais.clear();

        System.out.println("E agora? " + capitais.isEmpty());
    }
}
