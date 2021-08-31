package one.digital.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExemplo {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        nomes.stream().findFirst().ifPresent(System.out:: println);
        System.out.println(nomes.stream().peek(System.out:: println).collect(Collectors.toList()));
        System.out.println(nomes.stream().map(aluno-> aluno.concat("-").concat(String.valueOf(aluno.length()))).collect(Collectors.toList()));

        System.out.println("Contagem: " + nomes.stream().count());
        System.out.println("Retorna 3 elementos: " + nomes.stream().limit(3).collect(Collectors.toList()));

        System.out.println("Retorna elemento com maior número de letras: " + nomes.stream().max(Comparator.comparingInt(String::length)));
        System.out.println("Retorna elemento com menor número de letras: " + nomes.stream().min(Comparator.comparingInt(String::length)));

        System.out.println("Verifica se TODOS tem r: " + nomes.stream().allMatch((elemento)-> elemento.contains("r")));
        System.out.println("Verifica se ALGUM tem r: " + nomes.stream().anyMatch((elemento)-> elemento.contains("r")));
        System.out.println("Verifica se NENHUM tem r: " + nomes.stream().noneMatch((elemento)-> elemento.contains("r")));

        System.out.println("Filter letra R: " + nomes.stream().filter((nome)-> nome.toUpperCase().contains("R")).collect(Collectors.toList()));

        nomes.stream().forEach(System.out:: println);

        System.out.println("Operação encadeada: " +
                nomes.stream().peek(System.out:: println)
                .map(aluno-> aluno.concat("-").concat(String.valueOf(aluno.length())))
                .peek(System.out:: println)
                .filter((nome)-> nome.toUpperCase().contains("R"))
                        //.collect(Collectors.toList()));
                        //.collect(Collectors.joining(", ")));
                        //.collect(Collectors.toSet()));
                        .collect(Collectors.groupingBy(stu-> stu.substring(stu.indexOf("-") + 1))));

    }
}
