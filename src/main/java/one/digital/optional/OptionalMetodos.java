package one.digital.optional;

import java.util.Optional;

public class OptionalMetodos {
    public static void main(String[] args) {

        Optional<String> opt = Optional.of("Valor presente");
        System.out.println("Valor presente? " + opt.isPresent());
        System.out.println("Valor presente? " + opt.isEmpty());

        if(opt.isPresent())
        {
            var valor = opt.get();
            System.out.println("Valor presente: " + valor);
        }

        opt.map((valor)-> valor.concat("-------")).ifPresent(System.out:: println);
        opt.orElseThrow(IllegalStateException::new);

        //Optional<String> optempty = Optional.empty();
        //optempty.orElseThrow(IllegalStateException::new);
    }
}
