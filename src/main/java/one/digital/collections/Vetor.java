package one.digital.collections;

import java.util.*;
import java.util.stream.IntStream;

public class Vetor {
    public static void main(String[] args) {

        List<String> esportes = new Vector<>();

        esportes.add("Futebol");
        esportes.add("Basquete");
        esportes.add("Tênis de Mesa");
        esportes.add("Handebol");

        esportes.set(2,"Ping-Pong");
        esportes.remove("Handebol");

        var tamanho = esportes.size();
        System.out.println("tamanho: " + tamanho + " de " + esportes);

        var esporte = esportes.get(0);

        System.out.println("Tem " + esporte + " na lista? " + esportes.contains("Futebol"));
        System.out.println("Por indexof " + esportes.indexOf("Futebol") + esportes.indexOf("Basquete") + esportes.indexOf("Volei"));
        System.out.println("A lista está vazia? " + esportes.isEmpty());

        for(String espitem: esportes)
        {
            System.out.println("For..." + espitem);
        }

        Iterator<String> iterator = esportes.iterator();

        while(iterator.hasNext())
        {
            System.out.println("Itera..." + iterator.next());
        }

        esportes.clear();

        System.out.println("E agora? " + esportes.isEmpty());
    }
}
