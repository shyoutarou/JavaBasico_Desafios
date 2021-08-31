package one.digital.optional;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class OptionalExemplo {
    public static void main(String[] args) {

        Optional<String> opt = Optional.of("Valor presente");
        opt.ifPresentOrElse(System.out::println, ()-> System.out.println("Valor presente"));

        Optional<String> optnull = Optional.ofNullable(null);
        optnull.ifPresentOrElse(System.out::println, ()-> System.out.println("Valor NÃO presente"));

        Optional<String> optempty = Optional.empty();
        optempty.ifPresentOrElse((valor)-> System.out.println(valor), ()-> System.out.println("Valor NÃO presente - vazio"));

        //Optional<String> optNullerro = Optional.of(null);
        //optNullerro.ifPresentOrElse(System.out::println, ()-> System.out.println("Valor NÃO presente - erro"));

        OptionalInt.of(12).ifPresentOrElse(System.out::println, ()-> System.out.println("Valor presente"));
        OptionalDouble.of(-55.2).ifPresentOrElse(System.out::println, ()-> System.out.println("Valor presente"));
        OptionalLong.of(400L).ifPresentOrElse(System.out::println, ()-> System.out.println("Valor presente"));
    }
}
